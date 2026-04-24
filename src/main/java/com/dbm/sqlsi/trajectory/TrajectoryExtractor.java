package com.dbm.sqlsi.trajectory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

public class TrajectoryExtractor {

    public List<TrajectoryObject> extract(List<EventRow> rows) {
        Map<String, List<EventRow>> grouped = new LinkedHashMap<String, List<EventRow>>();

        for (EventRow row : rows) {
            if (!grouped.containsKey(row.getEntityId())) {
                grouped.put(row.getEntityId(), new ArrayList<EventRow>());
            }
            grouped.get(row.getEntityId()).add(row);
        }

        List<TrajectoryObject> result = new ArrayList<TrajectoryObject>();

        for (Map.Entry<String, List<EventRow>> entry : grouped.entrySet()) {
            List<EventRow> entityRows = entry.getValue();
            Collections.sort(entityRows, new Comparator<EventRow>() {
                @Override
                public int compare(EventRow a, EventRow b) {
                    return Long.compare(a.getTimestamp(), b.getTimestamp());
                }
            });

            List<Double> values = new ArrayList<Double>();
            for (EventRow r : entityRows) {
                values.add(r.getValue());
            }

            result.add(new TrajectoryObject("trajectory_" + entry.getKey(), values));
        }

        return result;
    }
}