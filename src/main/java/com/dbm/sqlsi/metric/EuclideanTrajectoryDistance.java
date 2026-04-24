package com.dbm.sqlsi.metric;

import com.dbm.sqlsi.trajectory.Trajectory;

public class EuclideanTrajectoryDistance implements MetricDistance<Trajectory> {

    @Override
    public double distance(Trajectory a, Trajectory b) {
        int n = Math.min(a.getPoints().size(), b.getPoints().size());
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double d = a.getPoints().get(i) - b.getPoints().get(i);
            sum += d * d;
        }
        return Math.sqrt(sum);
    }
}