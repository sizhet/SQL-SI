package com.dbm.sqlsi.trace;

import com.dbm.sqlsi.runtime.SqlSiRunResult;
import com.dbm.sqlsi.runtime.SqlSiRuntime;
import com.dbm.sqlsi.trajectory.EventRow;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SqlSiMarkdownTracePrinterTest {

    @Test
    public void shouldPrintMarkdownTraceWithTrajectoriesAndCccObjects() {
        List<EventRow> rows = Arrays.asList(
                new EventRow("u1", 1, 10.0),
                new EventRow("u1", 2, 12.0),
                new EventRow("u2", 1, 20.0),
                new EventRow("u2", 2, 22.0)
        );

        SqlSiRuntime runtime = new SqlSiRuntime();
        SqlSiRunResult result = runtime.run(rows);

        SqlSiMarkdownTracePrinter printer = new SqlSiMarkdownTracePrinter();
        String md = printer.print(result);

        assertTrue(md.contains("# SQL-SI Runtime Trace"));
        assertTrue(md.contains("## 1. Extracted Trajectories"));
        assertTrue(md.contains("## 2. Extracted CCC Objects"));
        assertTrue(md.contains("trajectory_u1"));
        assertTrue(md.contains("ccc_trajectory_u1"));
    }
}