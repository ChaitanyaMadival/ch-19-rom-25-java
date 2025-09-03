package com.xworkz.loksabhaapp;

import com.xworkz.loksabhaapp.loksabha.Lokasabha;
import com.xworkz.loksabhaapp.politician.Politician;

public class LokasabhaRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Politician politician1 = new Politician();
        politician1.setPoliticianId("1");
        politician1.setName("Narendra Modi");
        politician1.setAge("74");
        politician1.setGender("Male");
        politician1.setPartyName("BJP");
        politician1.setPartyPosition("Prime Minister");
        politician1.setState("Gujarat");
        politician1.setCountry("India");

        Politician politician2 = new Politician();
        politician2.setPoliticianId("2");
        politician2.setName("Rahul Gandhi");
        politician2.setAge("54");
        politician2.setGender("Male");
        politician2.setPartyName("Congress");
        politician2.setPartyPosition("MP");
        politician2.setState("Kerala");
        politician2.setCountry("India");

        Politician politician3 = new Politician();
        politician3.setPoliticianId("3");
        politician3.setName("Mamata Banerjee");
        politician3.setAge("69");
        politician3.setGender("Female");
        politician3.setPartyName("TMC");
        politician3.setPartyPosition("Chief Minister");
        politician3.setState("West Bengal");
        politician3.setCountry("India");

        Politician politician4 = new Politician();
        politician4.setPoliticianId("4");
        politician4.setName("Arvind Kejriwal");
        politician4.setAge("56");
        politician4.setGender("Male");
        politician4.setPartyName("AAP");
        politician4.setPartyPosition("Chief Minister");
        politician4.setState("Delhi");
        politician4.setCountry("India");

        Politician politician5 = new Politician();
        politician5.setPoliticianId("5");
        politician5.setName("Yogi Adityanath");
        politician5.setAge("51");
        politician5.setGender("Male");
        politician5.setPartyName("BJP");
        politician5.setPartyPosition("Chief Minister");
        politician5.setState("Uttar Pradesh");
        politician5.setCountry("India");

        Politician politician6 = new Politician();
        politician6.setPoliticianId("6");
        politician6.setName("Sonia Gandhi");
        politician6.setAge("77");
        politician6.setGender("Female");
        politician6.setPartyName("Congress");
        politician6.setPartyPosition("President (Interim)");
        politician6.setState("Uttar Pradesh");
        politician6.setCountry("India");

        Politician politician7 = new Politician();
        politician7.setPoliticianId("7");
        politician7.setName("Akhilesh Yadav");
        politician7.setAge("51");
        politician7.setGender("Male");
        politician7.setPartyName("Samajwadi Party");
        politician7.setPartyPosition("President");
        politician7.setState("Uttar Pradesh");
        politician7.setCountry("India");

        Politician politician8 = new Politician();
        politician8.setPoliticianId("8");
        politician8.setName("Sharad Pawar");
        politician8.setAge("84");
        politician8.setGender("Male");
        politician8.setPartyName("NCP");
        politician8.setPartyPosition("Founder");
        politician8.setState("Maharashtra");
        politician8.setCountry("India");

        Politician politician9 = new Politician();
        politician9.setPoliticianId("9");
        politician9.setName("Devendra Fadnavis");
        politician9.setAge("54");
        politician9.setGender("Male");
        politician9.setPartyName("BJP");
        politician9.setPartyPosition("Deputy CM");
        politician9.setState("Maharashtra");
        politician9.setCountry("India");

        Politician politician10 = new Politician();
        politician10.setPoliticianId("10");
        politician10.setName("MK Stalin");
        politician10.setAge("71");
        politician10.setGender("Male");
        politician10.setPartyName("DMK");
        politician10.setPartyPosition("Chief Minister");
        politician10.setState("Tamil Nadu");
        politician10.setCountry("India");

        Politician politician11 = new Politician();
        politician11.setPoliticianId("11");
        politician11.setName("Mayawati");
        politician11.setAge("68");
        politician11.setGender("Female");
        politician11.setPartyName("BSP");
        politician11.setPartyPosition("President");
        politician11.setState("Uttar Pradesh");
        politician11.setCountry("India");

        Politician politician12 = new Politician();
        politician12.setPoliticianId("12");
        politician12.setName("Siddaramaiah");
        politician12.setAge("75");
        politician12.setGender("Male");
        politician12.setPartyName("Congress");
        politician12.setPartyPosition("Chief Minister");
        politician12.setState("Karnataka");
        politician12.setCountry("India");


        Lokasabha lokasabha = new Lokasabha();
//        lokasabha.createUserInfo(politician);

        lokasabha.addPolitician(politician1);
        lokasabha.addPolitician(politician2);
        lokasabha.addPolitician(politician3);
        lokasabha.addPolitician(politician4);
        lokasabha.addPolitician(politician5);
        lokasabha.addPolitician(politician6);
        lokasabha.addPolitician(politician7);
        lokasabha.addPolitician(politician8);
        lokasabha.addPolitician(politician9);
        lokasabha.addPolitician(politician10);
        lokasabha.addPolitician(politician11);
        lokasabha.addPolitician(politician12);

        lokasabha.fetchPoliticianDetails();


        System.out.println("main ended");
    }
}
