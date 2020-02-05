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

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
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
        String nameValue, employerValue, locationValue, positionValue, competencyValue;

        if (name == "")
        {
            nameValue = "Data not available";
        } else { nameValue = name; }
        if (employer.getValue() == "")
        {
            employerValue = "Data not available";
        } else { employerValue = employer.getValue(); }
        if (location.getValue() == "")
        {
            locationValue = "Data not available";
        } else { locationValue = location.getValue(); }
        if (positionType.getValue() == "")
        {
            positionValue = "Data not available";
        } else { positionValue = positionType.getValue(); }
        if (coreCompetency.getValue() == "")
        {
            competencyValue = "Data not available";
        } else { competencyValue = coreCompetency.getValue(); }
        if (id != 0 && name == "" && employer.getValue() == "" && location.getValue() == "" && positionType.getValue() == "" && coreCompetency.getValue() == "")
        {
            return "OOPS! This job does not seem to exist.";
        }
        return "\n" +
                "ID: " + id + "\n" +
                "Name: " + nameValue + '\n' +
                "Employer: " + employerValue + '\n' +
                "Location: " + locationValue + '\n' +
                "Position Type: " + positionValue + '\n' +
                "Core Competency: " + competencyValue +
                "\n";
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
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

    public int getId() {
        return id;
    }
}
