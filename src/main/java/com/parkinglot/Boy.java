package com.parkinglot;

import java.util.LinkedList;

public class Boy {
    private LinkedList<ParkingLot> parkingLots;

    public Boy(LinkedList<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public Ticket parking(Car car) throws PositionException {
        for (ParkingLot parkingLot : parkingLots) {
            if(parkingLot.getTicketMap().size()<=parkingLot.getPosition()){
                return parkingLot.parking(car);
            }
        }
     return null;

    }
}
