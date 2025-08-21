package com.xworkz.passportapp;

import com.xworkz.passportapp.seva.PassportSeva;
import com.xworkz.passportapp.user.PassportUser;

public class PassportUserRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        PassportUser passportUser = new PassportUser();

        passportUser.setCpvLocation("PO");
        passportUser.setDcdrLocation("Bangalore");
        passportUser.setGivenName("Jack");
        passportUser.setSurName("Maa");
        passportUser.setDob("21-07-2003");
        passportUser.setEmail("jack@gmail.com");
        passportUser.setIsEmailLoginSame("No");
        passportUser.setLoginId("jack");
        passportUser.setPwd("jack@123");
        passportUser.setConfirmPwd("jack@123");
        passportUser.setHintQues("Best friend name");
        passportUser.setHintAns("Joy");
        passportUser.setCaptcha("CR7SUII");


        PassportSeva passporSevatUser = new PassportSeva();
        //seva depend on passport user to create passport user
        passporSevatUser.createPassportUser(passportUser);





        String cpvLocation = passportUser.getCpvLocation();
        String dcdrLocation = passportUser.getDcdrLocation();
        String givenName = passportUser.getGivenName();
        String surName = passportUser.getSurName();;
        String dob = passportUser.getDob();
        String email  = passportUser.getEmail();
        String emailLoginSame = passportUser.getIsEmailLoginSame();
        String loginId = passportUser.getLoginId();
        String pwd = passportUser.getPwd();
        String confirmPwd = passportUser.getConfirmPwd();;
        String hintQuestion = passportUser.getHintQues();
        String hintAns = passportUser.getHintAns();
        String captcha = passportUser.getCaptcha();

        System.out.println("CPV Location : "+cpvLocation);
        System.out.println("DCDR Location : "+dcdrLocation);
        System.out.println("Given Name : "+givenName);
        System.out.println("Sur Name : "+surName);
        System.out.println("Date of Birth : "+dob);
        System.out.println("Email Id : "+email);
        System.out.println("Is Email and Login Id is same : "+emailLoginSame);
        System.out.println("Login Id : "+loginId);
        System.out.println("Password : "+pwd);
        System.out.println("Conform Password : "+confirmPwd);
        System.out.println("Hint Question : "+hintQuestion);
        System.out.println("Hint Answer : "+hintAns);
        System.out.println("Captcha : "+captcha);



        System.out.println("Main ended");
    }
}
