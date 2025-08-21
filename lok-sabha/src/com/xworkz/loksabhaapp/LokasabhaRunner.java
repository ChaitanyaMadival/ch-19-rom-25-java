package com.xworkz.loksabhaapp;

import com.xworkz.loksabhaapp.loksabha.Lokasabha;
import com.xworkz.loksabhaapp.politician.Politician;

public class LokasabhaRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Politician politician = new Politician();
        politician.setPoliticianId("17");
        politician.setName("Siddu");
        politician.setAge("54");
        politician.setGender("Male");
        politician.setPartyName("Congress");
        politician.setPartyPosition("CM");
        politician.setState("Karnataka");
        politician.setCountry("India");

        Lokasabha lokasabha = new Lokasabha();
        lokasabha.createUserInfo(politician);
        lokasabha.fetchPoliticianDetails();


        System.out.println("main ended");
    }
}
