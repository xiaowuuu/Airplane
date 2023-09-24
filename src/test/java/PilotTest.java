import org.example.CrewRank;
import org.example.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;
    @Before
    public void before(){
        pilot = new Pilot("Jerry", CrewRank.FIRSTOFFICER, "FLY3534");
    }
    @Test
    public void canGetName(){
        assertEquals("Jerry", pilot.getName());
    }
    @Test
    public void canGetRank(){
        assertEquals("First Officer", pilot.getRank());
    }
    @Test
    public void canFLy(){
        assertEquals("We are going to fly!", pilot.flyPlane());
    }

}
