package com.dbm.sqlsi.comparative;

public class SqlVsSqlSiComparisonResult {

    private final int rawRowCount;
    private final int traditionalRecomputedPatterns;
    private final int sqlSiStoredTrajectories;
    private final int sqlSiStoredCccObjects;

    public SqlVsSqlSiComparisonResult(
            int rawRowCount,
            int traditionalRecomputedPatterns,
            int sqlSiStoredTrajectories,
            int sqlSiStoredCccObjects
    ) {
        this.rawRowCount = rawRowCount;
        this.traditionalRecomputedPatterns = traditionalRecomputedPatterns;
        this.sqlSiStoredTrajectories = sqlSiStoredTrajectories;
        this.sqlSiStoredCccObjects = sqlSiStoredCccObjects;
    }

    public int getRawRowCount() {
        return rawRowCount;
    }

    public int getTraditionalRecomputedPatterns() {
        return traditionalRecomputedPatterns;
    }

    public int getSqlSiStoredTrajectories() {
        return sqlSiStoredTrajectories;
    }

    public int getSqlSiStoredCccObjects() {
        return sqlSiStoredCccObjects;
    }
}