package com.dbm.sqlsi.demo;

import com.dbm.sqlsi.runtime.SqlSiRunResult;
import com.dbm.sqlsi.runtime.SqlSiRuntime;
import com.dbm.sqlsi.trace.SqlSiMarkdownTracePrinter;
import com.dbm.sqlsi.trajectory.EventRow;

import java.util.Arrays;
import java.util.List;

public class SqlSiMarkdownTraceDemo {

    public static void main(String[] args) {
        List<EventRow> rows = Arrays.asList(
                new EventRow("u1", 1, 10.0),
                new EventRow("u1", 2, 12.0),
                new EventRow("u1", 3, 14.0),
                new EventRow("u2", 1, 30.0),
                new EventRow("u2", 2, 31.0),
                new EventRow("u2", 3, 29.0)
        );

        SqlSiRuntime runtime = new SqlSiRuntime();
        SqlSiRunResult result = runtime.run(rows);

        SqlSiMarkdownTracePrinter printer = new SqlSiMarkdownTracePrinter();
        System.out.println(printer.print(result));
    }
}