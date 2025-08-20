package com.makemytrip.redbusapp.redbus;

public class Redbus {
    private int busId;
    private  String busName;
    private  double ticketPricePerPerson;
    private int seatNumber;
    private String passengerName;

    public  int getBusId(){
        return  busId;
    }
    public  String getBusName(){
        return  busName;
    }
    public  double getTicketPricePerPerson(){
        return  ticketPricePerPerson;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public  void  setBusId(int busId){
        this.busId = busId;
    }
    public  void setBusName(String busName){
        this.busName = busName;
    }
    public  void setTicketPricePerPerson(double ticketPricePerPerson){
        this.ticketPricePerPerson = ticketPricePerPerson;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
}
