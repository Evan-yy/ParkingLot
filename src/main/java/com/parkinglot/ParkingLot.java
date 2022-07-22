package com.parkinglot;

import java.util.HashMap;

public class ParkingLot {
    private int position;
    private HashMap<Ticket, Car> ticketMap;

    public ParkingLot(int position) {
        this.position = position;
        this.ticketMap=new HashMap<Ticket,Car>();
    }


    public Ticket parking(Car car) {
        if(ticketMap.size()>=position){
            return null;
        }
        Ticket ticket = new Ticket();
        this.ticketMap.put(ticket, car);
        return ticket;
    }

    public Car fetch(Ticket ticket) throws WrongTicketException {
        for (Ticket ticketKey : this.ticketMap.keySet()) {
            if(ticketKey==ticket) {
                Car car = this.ticketMap.get(ticket);
                return car;
            }
        }
        throw new WrongTicketException("Unrecognized parking ticket");
    }
}
