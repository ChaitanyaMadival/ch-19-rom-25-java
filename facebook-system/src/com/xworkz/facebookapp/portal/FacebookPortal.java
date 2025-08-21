package com.xworkz.facebookapp.portal;

import com.xworkz.facebookapp.user.FacebookUser;

public class FacebookPortal {

    FacebookUser user;

    public  boolean createFacebookUser(FacebookUser user){
        boolean facebookUserCreated = false;

        boolean firstNameValidation = false;
        boolean middleNameValidation = false;
        boolean lastNameValidation = false;
        boolean dobValidation = false;
        boolean genderValidation = false;
        boolean emailValidation = false;
        boolean loginIdValidation = false;
        boolean pwdValidation = false;
        boolean confirmValidation = false;

        if(user.getFirstName() != null){
            firstNameValidation = true;
        }else{
            System.out.println("First name is not validated");
        }

        if(user.getMiddleName() != null){
            middleNameValidation = true;
        }else{
            System.out.println("Middle name is not validated");
        }

        if(user.getLastName() != null){
            lastNameValidation = true;
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
        }else{
            System.out.println("Gender is not validated");
        }

        if(user.getEmail() != null){
            emailValidation = true;
        }else{
            System.out.println("Email is not validated");
        }
        if(user.getLoginId() != null){
            loginIdValidation = true;
        }else {
            System.out.println("Login Id is not validated");
        }

        if(user.getPwd() != null){
            pwdValidation = true;
        }else{
            System.out.println("Password is not validated");
        }

        if(user.getConfirmPwd() != null){
            confirmValidation  = true;
        }else {
            System.out.println("Conform password is not validated");
        }

        if(firstNameValidation && middleNameValidation && lastNameValidation && dobValidation && genderValidation && emailValidation && loginIdValidation && pwdValidation && confirmValidation){
            facebookUserCreated = true;
            this.user =  user;
        }
        return facebookUserCreated;
    }

    public  void  fetchUserInfo(){
        System.out.println("First name : "+user.getFirstName());
        System.out.println("Middle name : "+user.getMiddleName());
        System.out.println("Last name : "+user.getLastName());
        System.out.println("Date of birth : "+user.getDob());
        System.out.println("Gender : "+user.getGender());
        System.out.println("Email : "+user.getLoginId());
        System.out.println("Login Id : "+user.getLoginId());
        System.out.println("Password : "+user.getPwd());
        System.out.println("Conform password : "+user.getConfirmPwd());
    }

}
