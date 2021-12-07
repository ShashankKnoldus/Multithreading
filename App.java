package com.knoldus.multithreading;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(final String[] args) {
        final TicketCounter ticketCounter = new TicketCounter();
        final TicketBookingThread t1 = new TicketBookingThread(ticketCounter, "Prabhat", 2);
        final TicketBookingThread t2 = new TicketBookingThread(ticketCounter, "Shashank", 2);
        t1.start();
        t2.start();
    }
}
    