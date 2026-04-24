package com.dbm.sqlsi.comparative;

import com.dbm.sqlsi.trajectory.EventRow;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SqlVsSqlSiComparativeRunnerTest {

    @Test
    public void shouldCompareTraditionalSqlAndSqlSiRuntime() {
        List<EventRow> rows = Arrays.asList(
                new EventRow("u1", 1, 10.0),
                new EventRow("u1", 2, 12.0),
                new EventRow("u2", 1, 30.0),
                new EventRow("u2", 2, 31.0)
        );

        SqlVsSqlSiComparativeRunner runner = new SqlVsSqlSiComparativeRunner();
        SqlVsSqlSiComparisonResult result = runner.run(rows);

        assertEquals(4, result.getRawRowCount());
        assertEquals(2, result.getTraditionalRecomputedPatterns());
        assertEquals(2, result.getSqlSiStoredTrajectories());
        assertEquals(2, result.getSqlSiStoredCccObjects());
    }
}