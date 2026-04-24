package com.dbm.sqlsi.ccc;

import com.dbm.sqlsi.trajectory.Trajectory;

public class SimpleCccExtractor {

    public CccObject extract(Trajectory t) {
        double avg = t.getPoints().stream().mapToDouble(x -> x).average().orElse(0);
        return new CccObject("ccc_" + t.id(), avg);
    }
}