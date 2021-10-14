package model;

public class Admin extends Account {

    public boolean addParkingFloor(ParkingLot parkingLot, ParkingFloor parkingFloor) {
        return false;
    }

    public boolean addParkingSpot(ParkingFloor parkingFloor, ParkingSpot parkingSpot) {
        return false;
    }

    public boolean addEntryGate(ParkingLot parkingLot, EntryGate entrygate) {
        return false;
    }

    public boolean addExitGate(ParkingLot parkingLot, ExitGate exitGate) {
        return false;
    }
}
