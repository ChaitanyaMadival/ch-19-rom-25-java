package com.xworkz.googleapp;

import com.xworkz.googleapp.portal.GoogleValidation;
import com.xworkz.googleapp.user.GoogleUser;

public class GoogleRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        GoogleUser user = new GoogleUser();
        user.setFirstName("Chaitanya");
        user.setLastName("Madival");
        user.setDob("21-07-2003");
        user.setGender("Female");
        user.setContactNumber(7411348257L);
        user.setPwd("123@CNM");
        user.setConformPassword("123@CNM");

        GoogleValidation googleUser = new GoogleValidation();
       boolean result =  googleUser.createGoogleUser(user);
       if(result == true){
           googleUser.getUserDetails();
       }

      //  googleUser.getUserDetails();


/*
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        String dob = user.getDob();
        String gender = user.getGender();
    */


        System.out.println("main ended");
    }
}
