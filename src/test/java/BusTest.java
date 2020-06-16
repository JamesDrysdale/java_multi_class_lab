import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Aberdeen", 5);
        person = new Person();
        busStop = new BusStop("Aberdeen city center");
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.addToQueue(person);
    }

    @Test
    public void hasDestination(){
        assertEquals("Aberdeen", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, bus.getCapacity());
    }

    @Test
    public void hasPassengers(){
        assertEquals(0, bus.passengersCount());
    }

    @Test
    public void canAddPassengers(){
        bus.addPassengerFromBusStop(busStop);
        assertEquals(1, bus.passengersCount());
    }

    @Test
    public void canNotAddMorePassengersThanCapacity(){
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        assertEquals(5, bus.passengersCount());
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        bus.removePassengerByIndex(2);
        assertEquals(2, bus.passengersCount());
    }

    @Test
    public void canCollectPersonFromStop(){
        bus.addPassengerFromBusStop(busStop);
        assertEquals(1, bus.passengersCount());
        assertEquals(5, busStop.queueCount());
    }

}
