package com.parkinglot;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkingLot {
    private int position;
    private HashMap<Ticket, Car> ticketMap;
    private ArrayList<Ticket> usedTickets;

    public ParkingLot(int position) {
        this.position = position;
        this.ticketMap=new HashMap<Ticket,Car>();
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public HashMap<Ticket, Car> getTicketMap() {
        return ticketMap;
    }

    public void setTicketMap(HashMap<Ticket, Car> ticketMap) {
        this.ticketMap = ticketMap;
    }

    public Ticket parking(Car car) throws PositionException {
        if(ticketMap.size()>=position){
            throw new PositionException("No available position");
        }
        Ticket ticket = new Ticket();
        this.ticketMap.put(ticket, car);
        return ticket;
    }

    public Car fetch(Ticket ticket) throws WrongTicketException {
        if(ticketMap.containsKey(ticket)){
                Car car = this.ticketMap.get(ticket);
                ticketMap.remove(ticket);
                return car;
        }
        throw new WrongTicketException("Unrecognized parking ticket");
    }

    public boolean isParkCar(){
      return true;
    }
}
