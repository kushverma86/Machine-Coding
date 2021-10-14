package model;

import java.util.List;
import java.util.Map;

public class ParkingFloor {
    int level;
    int totalParkingSpots;
    ParkingDisplayBoard parkingDisplayBoard;
    Map<ParkingSpot, List<ParkingSpot>> parkingSpotListMap;

    public ParkingFloor(int level, ParkingDisplayBoard parkingDisplayBoard){
        this.level = level;
        this.parkingDisplayBoard = parkingDisplayBoard;
    }
}
