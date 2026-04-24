package com.dbm.sqlsi.trajectory;

import com.dbm.sqlsi.metric.MetricPoint;
import java.util.List;

public class Trajectory implements MetricPoint {

    private final String id;
    private final List<Double> points;

    public Trajectory(String id, List<Double> points) {
        this.id = id;
        this.points = points;
    }

    @Override
    public String id() {
        return id;
    }

    public List<Double> getPoints() {
        return points;
    }
}