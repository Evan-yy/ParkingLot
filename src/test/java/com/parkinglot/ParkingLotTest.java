package com.parkinglot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {

    @Test
    void first_test() {
        assertEquals(1, 1);
    }

    @Test
    void should_return_ticket_when_parking_a_car_given_parking_lot_and_car() {
        //given
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car();

        //when
        Ticket ticket = parkingLot.parking(car);

        //then
        assertNotNull(ticket);


    }

    @Test
    void should_return_car_when_fetch_a_car_given_parking_lot_and_ticket() {
        //given
        ParkingLot parkingLot = new ParkingLot(10);
        Car parkCar = new Car();
        Ticket ticket = parkingLot.parking(parkCar);

        //when
        Car car = parkingLot.fetch(ticket);

        //then
        assertEquals(parkCar, car);

    }

    @Test
    void should_return_nothing_when_park_the_car_given_parking_lot_without_position() {
        //given
        ParkingLot parkingLot = new ParkingLot(0);
        Car parkCar = new Car();


        //when
        Ticket ticket = parkingLot.parking(parkCar);

        //then
        assertNull(ticket);

    }
}
