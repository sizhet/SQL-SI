package com.dbm.sqlsi.comparative;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ComparativeMarkdownReportPrinterTest {

    @Test
    public void shouldPrintComparativeMarkdownReport() {
        SqlVsSqlSiComparisonResult result =
                new SqlVsSqlSiComparisonResult(6, 2, 2, 2);

        ComparativeMarkdownReportPrinter printer = new ComparativeMarkdownReportPrinter();
        String md = printer.print(result);

        assertTrue(md.contains("# SQL vs SQL-SI Comparative Report"));
        assertTrue(md.contains("traditional SQL"));
        assertTrue(md.contains("SQL-SI"));
        assertTrue(md.contains("persistent structural intelligence"));
    }
}