package com.dbm.sqlsi.trace;

import com.dbm.sqlsi.ccc.CccObject;
import com.dbm.sqlsi.runtime.SqlSiRunResult;
import com.dbm.sqlsi.trajectory.TrajectoryObject;

public class SqlSiMarkdownTracePrinter {

    public String print(SqlSiRunResult result) {
        StringBuilder sb = new StringBuilder();

        sb.append("# SQL-SI Runtime Trace\n\n");

        sb.append("## 1. Extracted Trajectories\n\n");
        sb.append("| trajectory_id | values | average |\n");
        sb.append("|---|---:|---:|\n");

        for (TrajectoryObject t : result.getTrajectories()) {
            sb.append("| ")
              .append(t.id())
              .append(" | ")
              .append(t.getValues())
              .append(" | ")
              .append(String.format("%.4f", t.average()))
              .append(" |\n");
        }

        sb.append("\n## 2. Extracted CCC Objects\n\n");
        sb.append("| ccc_id | source_trajectory | signature | stability_score |\n");
        sb.append("|---|---|---:|---:|\n");

        for (CccObject c : result.getCccObjects()) {
            sb.append("| ")
              .append(c.id())
              .append(" | ")
              .append(c.getSourceTrajectoryId())
              .append(" | ")
              .append(String.format("%.4f", c.getSignature()))
              .append(" | ")
              .append(String.format("%.4f", c.getStabilityScore()))
              .append(" |\n");
        }

        sb.append("\n## 3. Interpretation\n\n");
        sb.append("SQL-SI transforms raw SQL-style event rows into persistent structural objects.\n");
        sb.append("The runtime extracts trajectories, derives CCC signatures, and stores them for reuse.\n");

        return sb.toString();
    }
}