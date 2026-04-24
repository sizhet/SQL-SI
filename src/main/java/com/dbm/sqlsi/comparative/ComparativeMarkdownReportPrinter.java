package com.dbm.sqlsi.comparative;

public class ComparativeMarkdownReportPrinter {

    public String print(SqlVsSqlSiComparisonResult result) {
        StringBuilder sb = new StringBuilder();

        sb.append("# SQL vs SQL-SI Comparative Report\n\n");

        sb.append("## Summary\n\n");
        sb.append("| dimension | traditional SQL | SQL-SI |\n");
        sb.append("|---|---:|---:|\n");
        sb.append("| raw rows | ")
          .append(result.getRawRowCount())
          .append(" | ")
          .append(result.getRawRowCount())
          .append(" |\n");

        sb.append("| recomputed / stored patterns | ")
          .append(result.getTraditionalRecomputedPatterns())
          .append(" recomputed averages | ")
          .append(result.getSqlSiStoredCccObjects())
          .append(" stored CCC objects |\n");

        sb.append("| trajectory objects | 0 | ")
          .append(result.getSqlSiStoredTrajectories())
          .append(" |\n");

        sb.append("\n## Interpretation\n\n");
        sb.append("Traditional SQL recomputes structural summaries at query time.\n\n");
        sb.append("SQL-SI extracts trajectories and CCC objects, stores them, and makes them reusable.\n\n");

        sb.append("## Key Claim\n\n");
        sb.append("> SQL-SI shifts SQL from query-time recomputation to persistent structural intelligence.\n");

        return sb.toString();
    }
}