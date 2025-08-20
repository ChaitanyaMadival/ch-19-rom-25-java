package com.tajhotel.hotelapp.hotel;

public class Hotel {
    private  int hotelId;
    private  String hotelName;
    private  String hotelLocation;

    public int getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
