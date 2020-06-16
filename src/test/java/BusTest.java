import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Aberdeen", 5);
        person = new Person();
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
        bus.addPassenger(person);
        assertEquals(1, bus.passengersCount());
    }

    @Test
    public void canNotAddMorePassengersThanCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.passengersCount());
    }

    @Test
    public void caRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassengerByIndex(2);
        assertEquals(2, bus.passengersCount());
    }
}
