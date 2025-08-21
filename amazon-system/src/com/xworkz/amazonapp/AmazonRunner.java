package com.xworkz.amazonapp;

import com.xworkz.amazonapp.user.AmzonUser;
import com.xworkz.amazonapp.validation.AmazonUserValidation;

public class AmazonRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        AmzonUser user = new AmzonUser();
        user.setEmail("chaitanya@gmail.com");
        user.setUserName("Chaitanya Madival");
        user.setPassword("123@CNM");
        user.setConformPassword("123@CNM");
        user.setPhoneNumber(7411348257L);
        user.setDob("21-07-2003");


        AmazonUserValidation amazonUser = new AmazonUserValidation();
        amazonUser.createAmazonUser(user);
        amazonUser.getUserDetails();


        /*
        String emailId = user.getEmail();
        String userName = user.getUserName();
        String password = user.getPassword();
        String confirmPassword = user.getConformPassword();
        long phoneNumber = user.getPhoneNumber();
        String dob = user.getDob();



        System.out.println("Email Id : "+emailId);
        System.out.println("User Name : "+userName);
        System.out.println("Password : "+password);
        System.out.println("Confirm Password : "+confirmPassword);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Date of Birth : "+dob);

*/



        System.out.println("main ended");
    }
}
