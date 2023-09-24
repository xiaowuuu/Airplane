package org.example;

public class CabinCrewMember extends CrewMember{
    public CabinCrewMember(String name, CrewRank rank){
        super(name, rank);
    }
    public String relayMessage(String message){
        return "Welcome on board" + message;
    }
}
