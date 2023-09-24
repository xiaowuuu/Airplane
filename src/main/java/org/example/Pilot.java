package org.example;

public class Pilot extends CrewMember{
    public String licenceNumber;
    public Pilot(String name, CrewRank rank, String licenceNumber){
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }
    public String getLicenceNumber(){
        return licenceNumber;
    }

    public String flyPlane(){
        return "We are going to fly!";
    }

}
