package com.xworkz.playstoreapp;

import com.xworkz.playstoreapp.store.Playsore;
import com.xworkz.playstoreapp.user.User;

public class PlaystoreRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        User user = new User();
        user.setUserId("C17");
        user.setFirstName("chaitanya");
        user.setMiddleName("N");
        user.setSurName("Madival");
        user.setAge("22");
        user.setAboveEighteen("Yes");
        user.setGender("Female");
        user.setDob("21/07/2003");
        user.setEmail("chaitanya@gmail.com");
        user.setPhoneNumber("7411348257");
        user.setAddressPincode("581402");
        user.setLandmark("Rajajinagar");
        user.setCity("Bengalore");
        user.setState("Karnataka");
        user.setCountry("India");


        Playsore playsore = new Playsore();
        playsore.createUserInfo(user);
        playsore.getUserDetails();


        System.out.println("main ended");
    }
}
