package com.cult.fitnessapp.cult;

public class Cult {
    private int gymId;
    private String gymLocation;
    private double gymPrice;
    private int numberOfTrainers;
    private  String trannerName;


    public double getGymPrice() {
        return gymPrice;
    }

    public String getGymLocation() {
        return gymLocation;
    }

    public int getGymId() {
        return gymId;
    }

    public int getNumberOfTrainers() {
        return numberOfTrainers;
    }

    public String getTrannerName() {
        return trannerName;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public void setGymPrice(double gymPrice) {
        this.gymPrice = gymPrice;
    }

    public void setGymLocation(String gymLocation) {
        this.gymLocation = gymLocation;
    }

    public void setNumberOfTrainers(int numberOfTrainers) {
        this.numberOfTrainers = numberOfTrainers;
    }

    public void setTrannerName(String trannerName) {
        this.trannerName = trannerName;
    }
}
