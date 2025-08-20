package com.bigtreeentertainment.bookmyshow;

import com.bigtreeentertainment.bookmyshow.ticketbooking.TicketBooking;

public class TicketBookingRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        TicketBooking movie = new TicketBooking();

        movie.setTicketId(1);
        movie.setMovieName("Su from So");
        movie.setPrice(190.0);

        int ticketId = movie.getTicketId();
        String movieName = movie.getMovieName();
        double ticketPrice = movie.getPrice();

        System.out.println("Ticket ID: "+ticketId);
        System.out.println("Movie Name: "+movieName);
        System.out.println("Ticket Price: "+ticketPrice);

        System.out.println("main ended");
    }
}
