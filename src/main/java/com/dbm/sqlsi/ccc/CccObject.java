package com.dbm.sqlsi.ccc;

import com.dbm.sqlsi.metric.MetricPoint;

public class CccObject implements MetricPoint {

    private final String id;
    private final String sourceTrajectoryId;
    private final double signature;
    private final double stabilityScore;

    public CccObject(String id, String sourceTrajectoryId, double signature, double stabilityScore) {
        this.id = id;
        this.sourceTrajectoryId = sourceTrajectoryId;
        this.signature = signature;
        this.stabilityScore = stabilityScore;
    }

    @Override
    public String id() {
        return id;
    }

    public String getSourceTrajectoryId() {
        return sourceTrajectoryId;
    }

    public double getSignature() {
        return signature;
    }

    public double getStabilityScore() {
        return stabilityScore;
    }
}