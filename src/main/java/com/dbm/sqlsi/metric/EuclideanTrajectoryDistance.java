package com.dbm.sqlsi.metric;

import com.dbm.sqlsi.trajectory.TrajectoryObject;

public class EuclideanTrajectoryDistance implements MetricDistance<TrajectoryObject> {

    @Override
    public double distance(TrajectoryObject a, TrajectoryObject b) {
        int n = Math.min(a.getValues().size(), b.getValues().size());
        if (n == 0) {
            return Double.POSITIVE_INFINITY;
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double diff = a.getValues().get(i) - b.getValues().get(i);
            sum += diff * diff;
        }

        return Math.sqrt(sum);
    }
}