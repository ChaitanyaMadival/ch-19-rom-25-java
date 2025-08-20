package com.bigtreeentertainment.bookmyshow.ticketbooking;

public class TicketBooking {
    private  int ticketId;
    private  String movieName;
    private  double price;

    public int getTicketId() {
        return ticketId;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getPrice() {
        return price;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

