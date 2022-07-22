package com.parkinglot;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingBoy {

    @Test
    void should_return_ticket_of_parking_first_when_park_car_given_a_boy_and_car() throws PositionException {
        //given
        Car car = new Car();
        ParkingLot parkingLot1 = new ParkingLot(10);
        ParkingLot parkingLot2 = new ParkingLot(10);
        LinkedList<ParkingLot> parkingLots = new LinkedList<>();
        parkingLots.add(parkingLot1);
        parkingLots.add(parkingLot2);
        Boy boy = new Boy(parkingLots);
        //when
        Ticket ticket = boy.parking(car);

        //then
        assertNotNull(ticket);
    }

}
