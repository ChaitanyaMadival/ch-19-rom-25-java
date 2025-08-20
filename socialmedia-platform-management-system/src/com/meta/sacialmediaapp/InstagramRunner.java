package com.meta.sacialmediaapp;

import com.meta.sacialmediaapp.instagram.Instagram;

public class InstagramRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Instagram instagram = new Instagram();

        instagram.setAccountId(1);
        instagram.setAccountHolderName("chaitanya_madival");
        instagram.setStatusOfAccount("Private");

        int accountId = instagram.getAccountId();
        String accountName = instagram.getAccountHolderName();
        String accountStatus = instagram.getStatusOfAccount();

        System.out.println("Account ID: "+accountId);
        System.out.println("Account holder name: "+accountName);
        System.out.println("Accont Status: "+accountStatus);

        System.out.println("main ended");
    }
}
