package com.xworkz.snapchatapp;

import com.xworkz.snapchatapp.portal.SnapchatPortal;
import com.xworkz.snapchatapp.user.SnapchatUser;

public class SnapchatRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        SnapchatUser user = new SnapchatUser();
        user.setFirstName("Chaitanya");
        user.setLastName("M");
        user.setDob("21/07/2003");
        user.setGender("Female");
        user.setEmailId("chaitanya@gmail.com");
        user.setPwd("chaitanya@123");
        user.setConformPwd("chaitanya@123");

        SnapchatPortal snapUser = new SnapchatPortal();
        snapUser.createUser(user);
        snapUser.fetchUserDetails();

        System.out.println("main ended");
    }
}
