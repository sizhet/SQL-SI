package com.dbm.sqlsi.ccc;

import com.dbm.sqlsi.trajectory.TrajectoryObject;

public class SimpleCccExtractor {

    public CccObject extract(TrajectoryObject trajectory) {
        double avg = trajectory.average();
        double stability = computeStability(trajectory);

        return new CccObject(
                "ccc_" + trajectory.id(),
                trajectory.id(),
                avg,
                stability
        );
    }

    private double computeStability(TrajectoryObject t) {
        if (t.getValues().size() <= 1) {
            return 1.0;
        }

        double avg = t.average();
        double variance = 0.0;

        for (Double v : t.getValues()) {
            double diff = v - avg;
            variance += diff * diff;
        }

        variance = variance / t.getValues().size();

        return 1.0 / (1.0 + variance);
    }
}