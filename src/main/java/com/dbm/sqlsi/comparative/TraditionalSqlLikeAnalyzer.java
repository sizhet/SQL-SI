package com.dbm.sqlsi.comparative;

import com.dbm.sqlsi.trajectory.EventRow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TraditionalSqlLikeAnalyzer {

    public Map<String, Double> computeAveragePerEntity(List<EventRow> rows) {
        Map<String, Double> sums = new HashMap<String, Double>();
        Map<String, Integer> counts = new HashMap<String, Integer>();

        for (EventRow row : rows) {
            String id = row.getEntityId();

            if (!sums.containsKey(id)) {
                sums.put(id, 0.0);
                counts.put(id, 0);
            }

            sums.put(id, sums.get(id) + row.getValue());
            counts.put(id, counts.get(id) + 1);
        }

        Map<String, Double> averages = new HashMap<String, Double>();

        for (String id : sums.keySet()) {
            averages.put(id, sums.get(id) / counts.get(id));
        }

        return averages;
    }
}