package com.parkinglot;

import java.util.HashMap;

public class ParkingLot {
    private int space;
    private HashMap<Ticket, Car> ticketMap;

    public ParkingLot(int space) {
        this.space = space;
        this.ticketMap=new HashMap<Ticket,Car>();
    }


    public Ticket parking(Car car) {
        if(space==0){
            return null;
        }
        Ticket ticket = new Ticket();
        this.ticketMap.put(ticket, car);
        return ticket;
    }

    public Car fetch(Ticket ticket) {
        Car car = this.ticketMap.get(ticket);
        return car;
    }
}
