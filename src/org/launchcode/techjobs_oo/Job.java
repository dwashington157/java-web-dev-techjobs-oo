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
    private int UniqueId;

    public Job(String product_tester, Employer acme, Location desert, PositionType quality_control, CoreCompetency persistence) {
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getUniqueId() {
        return UniqueId;
    }






    // TODO: Add constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.


    public Job(int id, String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this.id = id;
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public Job(int uniqueId) {
        UniqueId = uniqueId;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


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
//        String output = "";
//        if (name.equals(output)) {
//            name ="Data not available";
//        }
        String output = "";
        if (name == null || name.equals("")){
          name ="data not available";
        } else {output += name;
        }
//       if (employer.getValue().equals("") || employer.getValue() == null) {
//            employer.setValue("Data not available");
//        }
        return "\n"+
                "ID: " +id+ "\n"+
                "Name: " +name+"\n"+
                "Employer: "+employer+"\n"+
                "Location: " +location+"\n"+
                "Position Type: " +positionType+"\n" +
                "Core Competency: " +coreCompetency+"\n";

    }
}
