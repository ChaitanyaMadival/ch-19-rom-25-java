package com.xworkz.snapchatapp.portal;

import com.xworkz.snapchatapp.user.SnapchatUser;

public class SnapchatPortal {
    SnapchatUser user;

    public  boolean createUser(SnapchatUser user){
        boolean instagramUserCreated = false;

        boolean firstNameValidated = false;
        boolean lastNameValidated = false;
        boolean dobValidation = false;
        boolean genderValidation = false;
        boolean emailValidation = false;
        boolean pwdValidation = false;
        boolean confirmPwdValidation = false;

        if(user.getFirstName() != null){
            firstNameValidated = true;
        }else{
            System.out.println("First name is not validated");
        }

        if(user.getLastName() != null){
            lastNameValidated = true;
        }else {
            System.out.println("Last name is not validated");
        }

        if(user.getDob() != null){
            dobValidation = true;
        }else {
            System.out.println("Date of birth is not validated");
        }

        if(user.getGender() != null){
            genderValidation = true;
        }else {
            System.out.println("Gender is not validated");
        }
        if(user.getEmailId() != null){
            emailValidation = true;
        }else {
            System.out.println("Email is not validated");
        }
        if(user.getPwd() != null){
            pwdValidation = true;
        }else {
            System.out.println("Password is not validated");
        }

        if(user.getConformPwd() != null){
            confirmPwdValidation = true;
        }else {
            System.out.println("Conform password is not validated");
        }
        if(firstNameValidated && lastNameValidated && dobValidation && genderValidation && emailValidation && pwdValidation && confirmPwdValidation){
            instagramUserCreated = true;
            this.user = user;
        }
        return instagramUserCreated;
    }

    public  void  fetchUserDetails(){
        System.out.println("First name : "+user.getFirstName());
        System.out.println("Last name : "+user.getLastName());
        System.out.println("Date of birth : "+user.getDob());
        System.out.println("Gender : "+user.getGender());
        System.out.println("Email : "+user.getEmailId());
        System.out.println("Password : "+ user.getPwd());
        System.out.println("Confirm password : "+user.getConformPwd());
    }
}
