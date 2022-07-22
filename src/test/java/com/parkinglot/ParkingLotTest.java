package com.parkinglot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParkingLotTest {

    @Test
    void first_test(){
        assertEquals(1,1);
    }

    @Test
    void should_return_ticket_when_parking_a_car_given_parking_lot_and_car(){
        //given
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car();

        //when
        Ticket ticket = parkingLot.parking(car);

        //then
        assertNotNull(ticket);


    }


}
