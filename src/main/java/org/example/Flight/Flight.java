package org.example.Flight;

import org.example.CabinCrewMember;
import org.example.Passenger;
import org.example.Pilot;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> members;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private Airport destination;
    private Airport departure;
    private String departureTime;

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<CabinCrewMember> getMembers() {
        return members;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airport getDestination() {
        return destination;
    }

    public Airport getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> members, ArrayList<Passenger> passengers, Plane plane, String flightNumber, Airport destination, Airport departure, String departureTime) {
        this.pilots = pilots;
        this.members = members;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }



}
