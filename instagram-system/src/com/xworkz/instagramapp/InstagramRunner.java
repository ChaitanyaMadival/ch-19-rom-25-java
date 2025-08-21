package com.xworkz.instagramapp;

import com.xworkz.instagramapp.portal.InstagramPortal;
import com.xworkz.instagramapp.user.InstagramUser;

public class InstagramRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        InstagramUser user = new InstagramUser();
        user.setFirstName("Chaitanya");
        user.setLastName("Madival");
        user.setDob("21/07/2003");
        user.setGender("Female");
        user.setEmailId("chaitanya@gmail.com");
        user.setPwd("cnm@123");
        user.setConformPwd("cnm@123");


        InstagramPortal instaUser = new InstagramPortal();
        instaUser.createUser(user);
        instaUser.fetchUserDetails();


        System.out.println("main ended");
    }
}
