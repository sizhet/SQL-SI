package com.dbm.sqlsi.comparative;

import com.dbm.sqlsi.runtime.SqlSiRunResult;
import com.dbm.sqlsi.runtime.SqlSiRuntime;
import com.dbm.sqlsi.trajectory.EventRow;

import java.util.Map;
import java.util.List;

public class SqlVsSqlSiComparativeRunner {

    public SqlVsSqlSiComparisonResult run(List<EventRow> rows) {
        TraditionalSqlLikeAnalyzer sqlAnalyzer = new TraditionalSqlLikeAnalyzer();
        Map<String, Double> averages = sqlAnalyzer.computeAveragePerEntity(rows);

        SqlSiRuntime runtime = new SqlSiRuntime();
        SqlSiRunResult sqlSiResult = runtime.run(rows);

        return new SqlVsSqlSiComparisonResult(
                rows.size(),
                averages.size(),
                sqlSiResult.getTrajectories().size(),
                sqlSiResult.getCccObjects().size()
        );
    }
}