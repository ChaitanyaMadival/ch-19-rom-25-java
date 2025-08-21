package com.xworkz.facebookapp;

import com.xworkz.facebookapp.portal.FacebookPortal;
import com.xworkz.facebookapp.user.FacebookUser;

public class FacebookRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        FacebookUser user = new FacebookUser();
        user.setFirstName("Chaitanya");
        user.setMiddleName("N");
        user.setLastName("Madival");
        user.setDob("21/07/2003");
        user.setGender("Female");
        user.setEmail("chaitanya@gamil.com");
        user.setLoginId("chaitanya_madival");
        user.setPwd("chaitu@123");
        user.setConfirmPwd("chaitu@123");


        FacebookPortal faceBookUser = new FacebookPortal();
        faceBookUser.createFacebookUser(user);
        faceBookUser.fetchUserInfo();



        System.out.println("main ended");
    }
}
