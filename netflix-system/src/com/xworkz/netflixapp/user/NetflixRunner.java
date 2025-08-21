package com.xworkz.netflixapp.user;

import com.xworkz.netflixapp.NetflixUser;
import com.xworkz.netflixapp.portal.NetflixPortal;

public class NetflixRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        NetflixUser user = new NetflixUser();
        user.setFirstName("Chaitanya");
        user.setLastName("Madival");
        user.setDob("21/07/2003");
        user.setGender("Female");
        user.setEmail("chaitanya@gmail.com");
        user.setContactNumber("7411348257");
        user.setPwd("cnm@123");
        user.setConfirmPwd("cnm@123");

        NetflixPortal netflixUser = new NetflixPortal();
        netflixUser.createNetflixUser(user);
        netflixUser.getUserDetails();



        System.out.println("main ended");
    }
}
