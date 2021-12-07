package com.knoldus.multithreading;

public class TicketBookingThread extends Thread
{
    private TicketCounter ticketCounter;
    private String passengerName;
    private int noOfSeatsToBook;
    
    public TicketBookingThread(final TicketCounter ticketCounter, final String passengerName, final int noOfSeatsToBook) {
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.noOfSeatsToBook = noOfSeatsToBook;
    }
    public void run() {
        this.ticketCounter.bookTicket(this.passengerName, this.noOfSeatsToBook);
    }
}