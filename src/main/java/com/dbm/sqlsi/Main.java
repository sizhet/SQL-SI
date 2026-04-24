package com.dbm.sqlsi;

import com.dbm.sqlsi.trajectory.Trajectory;
import com.dbm.sqlsi.metric.EuclideanTrajectoryDistance;
import com.dbm.sqlsi.ccc.SimpleCccExtractor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Trajectory t1 = new Trajectory("t1", Arrays.asList(1.0, 2.0, 3.0));
        Trajectory t2 = new Trajectory("t2", Arrays.asList(2.0, 3.0, 4.0));

        EuclideanTrajectoryDistance dist = new EuclideanTrajectoryDistance();
        double d = dist.distance(t1, t2);

        System.out.println("Distance: " + d);

        SimpleCccExtractor extractor = new SimpleCccExtractor();
        System.out.println("CCC t1: " + extractor.extract(t1).getSignature());
    }
}