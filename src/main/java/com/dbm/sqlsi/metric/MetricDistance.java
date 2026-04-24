package com.dbm.sqlsi.metric;

public interface MetricDistance<T extends MetricPoint> {
    double distance(T a, T b);
}