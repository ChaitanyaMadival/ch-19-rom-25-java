package com.makemytrip.redbusapp;

import com.makemytrip.redbusapp.redbus.Redbus;

public class RedbusRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Redbus bus = new Redbus();

        bus.setBusId(1);
        bus.setBusName("Shree Kumar Bus");
        bus.setTicketPricePerPerson(899.05);
        bus.setSeatNumber(7);
        bus.setPassengerName("Chaitanya N M");

        int busId = bus.getBusId();
        String busName = bus.getBusName();
        double ticketPricePerPersons = bus.getTicketPricePerPerson();
        int seatNumber = bus.getSeatNumber();
        String passengerName = bus.getPassengerName();

        System.out.println("Bus ID: "+busId);
        System.out.println("Bus Name: "+busName);
        System.out.println("Bus Ticket Price: "+ticketPricePerPersons);
        System.out.println("Seat Number: "+seatNumber);
        System.out.println("Passenger Name: "+passengerName);


        System.out.println("main ended");
    }
}
