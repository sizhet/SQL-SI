package com.dbm.sqlsi.runtime;

import com.dbm.sqlsi.ccc.CccObject;
import com.dbm.sqlsi.trajectory.TrajectoryObject;

import java.util.List;

public class SqlSiRunResult {

    private final List<TrajectoryObject> trajectories;
    private final List<CccObject> cccObjects;

    public SqlSiRunResult(List<TrajectoryObject> trajectories, List<CccObject> cccObjects) {
        this.trajectories = trajectories;
        this.cccObjects = cccObjects;
    }

    public List<TrajectoryObject> getTrajectories() {
        return trajectories;
    }

    public List<CccObject> getCccObjects() {
        return cccObjects;
    }
}