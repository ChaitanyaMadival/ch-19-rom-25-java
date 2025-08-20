package com.tajhotel.hotelapp;

import com.tajhotel.hotelapp.hotel.Hotel;

public class HotelRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Hotel hotel = new Hotel();

        hotel.setHotelId(1);
        hotel.setHotelName("Meghana's Biryani");
        hotel.setHotelLocation("Rajajinagar");

        int hotelId = hotel.getHotelId();
        String hotelName = hotel.getHotelName();
        String hotelLocation = hotel.getHotelLocation();


        System.out.println("Hotel ID: "+hotelId);
        System.out.println("Hotel Name: "+hotelName);
        System.out.println("Location: "+hotelLocation);

        System.out.println("main ended");
    }
}
