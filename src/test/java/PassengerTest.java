import org.example.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;
    @Before
    public void before(){
        passenger = new Passenger("Tom", 1);
    }

    @Test
    public void canGetName(){
        assertEquals("Tom", passenger.getName());
    }
    @Test
    public void canGetBagNum(){
        assertEquals(1, passenger.getNumOfBags());
    }
}
