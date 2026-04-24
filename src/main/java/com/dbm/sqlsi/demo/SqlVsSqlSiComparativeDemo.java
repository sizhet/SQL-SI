package com.dbm.sqlsi.demo;

import com.dbm.sqlsi.comparative.ComparativeMarkdownReportPrinter;
import com.dbm.sqlsi.comparative.SqlVsSqlSiComparativeRunner;
import com.dbm.sqlsi.comparative.SqlVsSqlSiComparisonResult;
import com.dbm.sqlsi.trajectory.EventRow;

import java.util.Arrays;
import java.util.List;

public class SqlVsSqlSiComparativeDemo {

    public static void main(String[] args) {
        List<EventRow> rows = Arrays.asList(
                new EventRow("u1", 1, 10.0),
                new EventRow("u1", 2, 12.0),
                new EventRow("u1", 3, 14.0),
                new EventRow("u2", 1, 30.0),
                new EventRow("u2", 2, 31.0),
                new EventRow("u2", 3, 29.0)
        );

        SqlVsSqlSiComparativeRunner runner = new SqlVsSqlSiComparativeRunner();
        SqlVsSqlSiComparisonResult result = runner.run(rows);

        ComparativeMarkdownReportPrinter printer = new ComparativeMarkdownReportPrinter();
        System.out.println(printer.print(result));
    }
}