package com.xworkz.spotifyapp.user;

import com.xworkz.spotifyapp.SpotifyUser;
import com.xworkz.spotifyapp.portal.SpotifyPortal;

public class SpotifyRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        SpotifyUser user = new SpotifyUser();
        user.setFirstName("Chaitanya");
        user.setMiddleName("Narayan");
        user.setLastName("Madival");
        user.setDob("21-07-2003");
        user.setGender("Female");
        user.setEmail("chaitanya@gamil.com");
        user.setLoginId("music_lover");
        user.setPwd("chaitu@123");
        user.setConfirmPwd("chaitu@123");


        SpotifyPortal spotifyUser = new SpotifyPortal();
        spotifyUser.createFacebookUser(user);
        spotifyUser.fetchUserInfo();


        System.out.println("main ended");
    }

}
