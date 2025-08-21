package com.xworkz.policeapp;

import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.station.Station;

public class PoliceStationRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Station police = new Station();
        police.setOfficerId("1277");
        police.setOfficerName("Vikram");
        police.setGender("Male");
        police.setBadgeNumber("ACP7743");
        police.setStationName("City Police Control Room");
        police.setDepartment("Criminal");
        police.setPhoneNumber("97317672929");
        police.setEmail("vikky@gmail.com");

        Police policeDetails = new Police();
        policeDetails.createPoliceInfo(police);
        policeDetails.getPoliceDetails();

        System.out.println("main ended");
    }
}

