import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Aberdeen City Center");
        person = new Person();
    }

    @Test
    public void hasName(){
        assertEquals("Aberdeen City Center", busStop.getName());
    }

    @Test
    public void hasEmptyQueue(){
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addToQueue(person);
        assertEquals(1, busStop.queueCount());
    }
}
