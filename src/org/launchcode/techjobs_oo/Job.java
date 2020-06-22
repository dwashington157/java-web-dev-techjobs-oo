package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;



    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;



    public Job() {
        this.id = nextId;
        nextId++;
    }


    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Job.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {

        if (name == null || name.equals("")) {
            name = "data not available";
        }

        if (employer.getValue() == null || employer.getValue().equals("")) {
            employer.setValue("data not available");
        }

        if (location.getValue() == null || location.getValue().equals("")) {
            location.setValue("data not available");
        }
        if (positionType.getValue() == null || positionType.getValue().equals("")) {
            positionType.setValue("data not available");
        }

            return "\n" +
                    "ID: " + id + "\n" +
                    "Name: " + name + "\n" +
                    "Employer: " + employer + "\n" +
                    "Location: " + location + "\n" +
                    "Position Type: " + positionType + "\n" +
                    "Core Competency: " + coreCompetency + "\n";

        }

    }
