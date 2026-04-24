package com.dbm.sqlsi.trajectory;

public class EventRow {

    private final String entityId;
    private final long timestamp;
    private final double value;

    public EventRow(String entityId, long timestamp, double value) {
        this.entityId = entityId;
        this.timestamp = timestamp;
        this.value = value;
    }

    public String getEntityId() {
        return entityId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public double getValue() {
        return value;
    }
}