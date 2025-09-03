package com.xworkz.policeapp;

import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.stations.Station;

public class PoliceStationRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Police police1 = new Police();
        police1.setOfficerId("1");
        police1.setOfficerName("Vikram");
        police1.setGender("Male");
        police1.setBadgeNumber("ACP7743");
        police1.setStationName("City Police Control Room");
        police1.setDepartment("Criminal");
        police1.setPhoneNumber("97317672929");
        police1.setEmail("vikky@gmail.com");

        Police police2 = new Police();
        police2.setOfficerId("2");
        police2.setOfficerName("Anjali Sharma");
        police2.setGender("Female");
        police2.setBadgeNumber("SI1123");
        police2.setStationName("South Zone Station");
        police2.setDepartment("Traffic");
        police2.setPhoneNumber("9876543210");
        police2.setEmail("anjali.sharma@police.in");

        Police police3 = new Police();
        police3.setOfficerId("3");
        police3.setOfficerName("Rajesh Kumar");
        police3.setGender("Male");
        police3.setBadgeNumber("DSP2211");
        police3.setStationName("North Division HQ");
        police3.setDepartment("Cyber Crime");
        police3.setPhoneNumber("9123456789");
        police3.setEmail("rajesh.kumar@police.in");

        Police police4 = new Police();
        police4.setOfficerId("4");
        police4.setOfficerName("Priya Nair");
        police4.setGender("Female");
        police4.setBadgeNumber("CI3300");
        police4.setStationName("Central Police Station");
        police4.setDepartment("Women's Safety");
        police4.setPhoneNumber("9012345678");
        police4.setEmail("priya.nair@police.in");

        Police police5 = new Police();
        police5.setOfficerId("5");
        police5.setOfficerName("Manoj Verma");
        police5.setGender("Male");
        police5.setBadgeNumber("ACP9988");
        police5.setStationName("East Sector Station");
        police5.setDepartment("Narcotics");
        police5.setPhoneNumber("9345678901");
        police5.setEmail("manoj.verma@police.in");

        Police police6 = new Police();
        police6.setOfficerId("6");
        police6.setOfficerName("Deepika Rao");
        police6.setGender("Female");
        police6.setBadgeNumber("SI4455");
        police6.setStationName("West End Station");
        police6.setDepartment("Forensics");
        police6.setPhoneNumber("7890123456");
        police6.setEmail("deepika.rao@police.in");


        Station station = new Station();
//        policeDetails.createPoliceInfo(police);
        station.addPolice(police1);
        station.addPolice(police2);
        station.addPolice(police3);
        station.addPolice(police4);
        station.addPolice(police5);
        station.addPolice(police6);


        station.getPoliceDetails();

        System.out.println("main ended");
    }
}

