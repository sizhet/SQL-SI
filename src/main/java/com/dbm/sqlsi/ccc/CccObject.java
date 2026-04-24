package com.dbm.sqlsi.ccc;

import com.dbm.sqlsi.metric.MetricPoint;

public class CccObject implements MetricPoint {

    private final String id;
    private final double signature;

    public CccObject(String id, double signature) {
        this.id = id;
        this.signature = signature;
    }

    @Override
    public String id() {
        return id;
    }

    public double getSignature() {
        return signature;
    }
}