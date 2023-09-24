import org.example.CabinCrewMember;
import org.example.CrewRank;
import org.example.Flight.Airport;
import org.example.Flight.Flight;
import org.example.Flight.Plane;
import org.example.Flight.PlaneType;
import org.example.Passenger;
import org.example.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane;
    Pilot pilot;
    Passenger passenger1;
    Passenger passenger2;
    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        passenger1 = new Passenger("Jimmy", 1);
        passenger2 = new Passenger("Pete", 2);
        cabinCrewMember = new CabinCrewMember("Jane", CrewRank.FLIGHTATTENDANT);
        pilot = new Pilot("Olive", CrewRank.FIRSTOFFICER, "FLY3543534");
        plane = new Plane(PlaneType.GLIDER);
        flight = new Flight(plane, "EDI534546", Airport.STANSTED, Airport.EDINBURGH, "SEP 22:00");
    }

    @Test
    public void canGetPassenger(){
        assertEquals("Jimmy", passenger1.getName());
    }
    @Test
    public void canGetCrewMember(){
        assertEquals("Jane", cabinCrewMember.getName());
    }
    @Test
    public void canGetCrewRank(){
        assertEquals("Flight Attendant", cabinCrewMember.getRank());
    }
    @Test
    public void canGetPilotName(){
        assertEquals("Olive", pilot.getName());
    }
    @Test
    public void canGetPilotLicence(){
        assertEquals("FLY3543534", pilot.getLicenceNumber());
    }
    @Test
    public void canGetDeparture(){
        assertEquals("EDI", flight.getDeparture());
    }
    @Test
    public void canGetDestination(){
        assertEquals("STN", flight.getDestination());
    }
    @Test
    public void canGetDepartureTime(){
        assertEquals("SEP 22:00", flight.getDepartureTime());
    }
    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getPassengers());
    }
}
