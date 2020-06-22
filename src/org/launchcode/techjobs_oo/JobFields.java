package org.launchcode.techjobs_oo;

import java.util.Objects;

public class JobFields {

    private final int id;
    private static int nextId = 1;
    private String value;
    
    
    public JobFields() {
        id = nextId;
        nextId++;
    }

    public JobFields(String value) {
        this();
        this.value = value;
    }
    public static int getNextId() {
        return nextId;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobFields)) return false;
       JobFields jobMarket = (JobFields) o;
        return getId() == jobMarket.getId();
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
