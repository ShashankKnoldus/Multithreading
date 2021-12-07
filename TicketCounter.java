package com.knoldus.multithreading;

public class TicketCounter {


    private int availableSeats;
    
    public TicketCounter() {
        this.availableSeats = 3;
    }
    
    public synchronized void bookTicket(final String pname, final int numberOfSeats) {
        if (this.availableSeats >= numberOfSeats && numberOfSeats > 0) {
            System.out.println("Hi," + pname + " : " + numberOfSeats + " Seats booked Successfully..");
            this.availableSeats -= numberOfSeats;
        }
        else {
            System.out.println("Hi," + pname + " : Seats Not Available");
        }
    }
}

	


