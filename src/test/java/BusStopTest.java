import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;

    @Before
    public void before(){
        busStop = new BusStop("Aberdeen City Center");
    }

    @Test
    public void hasName(){
        assertEquals("Aberdeen City Center", busStop.getName());
    }
}
