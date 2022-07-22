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
    void should_return_car_when_fetch_a_car_given_parking_lot_and_ticket() throws WrongTicketException {
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

    @Test
    void should_return_the_right_each_car_when_fetch_the_car_twice_given_parking_lot_and_two_car() throws WrongTicketException {
        //given
        ParkingLot parkingLot = new ParkingLot(10);
        Car parkCar1 = new Car();
        Car parkCar2 = new Car();
        Ticket ticket1 = parkingLot.parking(parkCar1);
        Ticket ticket2 = parkingLot.parking(parkCar2);


        //when
        Car fetchCar1 = parkingLot.fetch(ticket1);
        Car fetchCar2 = parkingLot.fetch(ticket2);


        //then
        assertEquals(parkCar1,fetchCar1);
        assertEquals(parkCar2,fetchCar2);

    }

//    @Test
//    void should_return_nothing_when_fetch_the_car_given_parking_lot_and_a_wrong_ticket() throws WrongTicket {
//        //given
//        ParkingLot parkingLot = new ParkingLot(10);
//        Car parkCar = new Car();
//        Ticket ticket = new Ticket();
//
//
//        //when
//        Car fetchCar = parkingLot.fetch(ticket);
//
//
//        //then
//        assertNull(fetchCar);
//
//    }

    @Test
    void should_return_exception_when_fetch_car_given_parking_lot_and_the_wrong_ticket(){
        //given
        ParkingLot parkingLot = new ParkingLot(10);
        Car parkCar = new Car();

        Ticket ticket = new Ticket();


        //then
        WrongTicketException wrongTicketException = assertThrows(WrongTicketException.class, () -> {
            //when
            parkingLot.fetch(ticket);
        });
        assertEquals("Unrecognized parking ticket", wrongTicketException.getMessage());

    }

}
