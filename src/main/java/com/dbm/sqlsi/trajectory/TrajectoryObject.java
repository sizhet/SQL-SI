package com.dbm.sqlsi.trajectory;

import com.dbm.sqlsi.metric.MetricPoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrajectoryObject implements MetricPoint {

    private final String id;
    private final List<Double> values;

    public TrajectoryObject(String id, List<Double> values) {
        this.id = id;
        this.values = new ArrayList<Double>(values);
    }

    @Override
    public String id() {
        return id;
    }

    public List<Double> getValues() {
        return Collections.unmodifiableList(values);
    }

    public double average() {
        if (values.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Double v : values) {
            sum += v;
        }
        return sum / values.size();
    }
}