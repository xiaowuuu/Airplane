package org.example;

public enum CrewRank {
    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHTATTENDANT("Flight Attendant");
    private final String rank;

    public String getRank() {
        return rank;
    }

    CrewRank(String rank){
        this.rank = rank;
    }
}
