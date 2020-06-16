import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination(){
        return this.destination;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int passengersCount(){
        return this.passengers.size();
    }

    public void addPassengerFromBusStop(BusStop busStop){
        if(passengersCount() < this.capacity) {
            Person person = busStop.removeFromQueue();
            this.passengers.add(person);
        }
    }

    public void removePassengerByIndex(int index){
        this.passengers.remove(index);
    }

//    public void pickUpPerson(BusStop busStop){
//        if(passengersCount() < this.capacity) {
//            Person person = busStop.removeFromQueue();
//            addPassenger(person);
//        }
//    }
}
