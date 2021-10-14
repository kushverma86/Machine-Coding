package model;

import java.util.List;
import Exception.InvalidParkingFloorException;

public class ParkingLot {

    private final String name;
    private final Address address;
    private List<ParkingFloor> parkingFloor;
    List<EntryGate> entryGates;
    List<ExitGate> exitGates;
    private int totalCapacity;


    public ParkingLot(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public ParkingFloor getParkingFloor(int level) {
        if (parkingFloor.size() < level)
            throw new InvalidParkingFloorException();

        return parkingFloor.get(level);
    }

    public int getTotalCapacity(){
        return totalCapacity;
    }

    public List<ParkingFloor> getParkingFloor() {
        return parkingFloor;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public boolean isParkingSpaceAvailable(Vehicle vehicle){
        return false;
    }
}
