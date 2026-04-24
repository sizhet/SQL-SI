package com.dbm.sqlsi.runtime;

import com.dbm.sqlsi.ccc.CccObject;
import com.dbm.sqlsi.ccc.SimpleCccExtractor;
import com.dbm.sqlsi.store.StructuralObjectStore;
import com.dbm.sqlsi.trajectory.EventRow;
import com.dbm.sqlsi.trajectory.TrajectoryExtractor;
import com.dbm.sqlsi.trajectory.TrajectoryObject;

import java.util.ArrayList;
import java.util.List;

public class SqlSiRuntime {

    private final TrajectoryExtractor trajectoryExtractor;
    private final SimpleCccExtractor cccExtractor;
    private final StructuralObjectStore store;

    public SqlSiRuntime() {
        this.trajectoryExtractor = new TrajectoryExtractor();
        this.cccExtractor = new SimpleCccExtractor();
        this.store = new StructuralObjectStore();
    }

    public SqlSiRunResult run(List<EventRow> rows) {
        List<TrajectoryObject> trajectories = trajectoryExtractor.extract(rows);
        List<CccObject> cccObjects = new ArrayList<CccObject>();

        for (TrajectoryObject trajectory : trajectories) {
            store.saveTrajectory(trajectory);

            CccObject ccc = cccExtractor.extract(trajectory);
            store.saveCcc(ccc);
            cccObjects.add(ccc);
        }

        return new SqlSiRunResult(trajectories, cccObjects);
    }

    public StructuralObjectStore getStore() {
        return store;
    }
}