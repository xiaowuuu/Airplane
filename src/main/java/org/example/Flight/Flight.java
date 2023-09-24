package org.example.Flight;

import org.example.CabinCrewMember;
import org.example.Passenger;
import org.example.Pilot;
import org.example.Flight.Plane;

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

    private ArrayList<Pilot> pilots() {
        return pilots;
    }

    public ArrayList<CabinCrewMember> getMembers() {
        return members;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public ArrayList<CabinCrewMember> members() {
        return members;
    }

    public ArrayList<Passenger> passengers() {
        return passengers;
    }
    public int getPilots(){
        return pilots.size();
    }
    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination.getCode();
    }

    public String getDeparture() {
        return departure.getCode();
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

    public Flight(Plane plane, String flightNumber, Airport destination, Airport departure, String departureTime) {
        this.pilots = new ArrayList<Pilot>();
        this.members = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }
    public int availableSeats(){
        return (this.plane.getPlaneCapacity() - this.getPassengers());
    }

    public void addPassenger(Passenger passenger) {
        if (this.plane.getPlaneCapacity() > this.getPassengers()){
            this.passengers.add(passenger);
    }



}
