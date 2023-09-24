import org.example.CabinCrewMember;
import org.example.CrewRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;
    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Vickey", CrewRank.CAPTAIN);
    }
    @Test
    public void canGetName(){
        assertEquals("Vickey", cabinCrewMember.getName());
    }
    @Test
    public void canGetRank(){
        assertEquals("Captain", cabinCrewMember.getRank());
    }
    @Test
    public void canRelayMessage(){
        String message = cabinCrewMember.relayMessage(" yo yo");
        assertEquals("Welcome on board yo yo", message);
    }
}
