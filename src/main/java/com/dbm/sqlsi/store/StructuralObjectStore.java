package com.dbm.sqlsi.store;

import com.dbm.sqlsi.ccc.CccObject;
import com.dbm.sqlsi.trajectory.TrajectoryObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StructuralObjectStore {

    private final List<TrajectoryObject> trajectories = new ArrayList<TrajectoryObject>();
    private final List<CccObject> cccObjects = new ArrayList<CccObject>();

    public void saveTrajectory(TrajectoryObject trajectory) {
        trajectories.add(trajectory);
    }

    public void saveCcc(CccObject ccc) {
        cccObjects.add(ccc);
    }

    public List<TrajectoryObject> getTrajectories() {
        return Collections.unmodifiableList(trajectories);
    }

    public List<CccObject> getCccObjects() {
        return Collections.unmodifiableList(cccObjects);
    }
}