package com.parkinglot;

public class WrongTicketException extends Exception {
    public WrongTicketException(String message){
        super(message);
    }
}
