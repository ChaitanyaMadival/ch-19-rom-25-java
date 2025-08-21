package com.xworkz.netflixapp.portal;

import com.xworkz.netflixapp.NetflixUser;

public class NetflixPortal {
    NetflixUser user;

    public  boolean createNetflixUser(NetflixUser user){
        boolean netflixUserCreated = false;

        boolean firstNameValidation = false;
        boolean lastNameValidation = false;
        boolean contactNumberValidation = false;
        boolean dobValidation = false;
        boolean genderValidation = false;
        boolean emailValidation = false;
        boolean pwdValidation = false;
        boolean confirmPwdValidation = false;

        if(user.getFirstName() != null){
            firstNameValidation = true;
        }else {
            System.out.println("First Name is not validated");
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
        if(user.getContactNumber() != null){
            contactNumberValidation = true;
        }else {
            System.out.println("Contact number is not validated");
        }
        if(user.getEmail() != null){
            emailValidation = true;
        }else {
            System.out.println("Email is not validated");
        }
        if(user.getPwd() != null){
            pwdValidation = true;
        }else {
            System.out.println("Password is not validated");
        }
        if(user.getConfirmPwd()!= null){
            confirmPwdValidation = true;
        }else {
            System.out.println("Confirm password is not validated");
        }
        if(firstNameValidation && lastNameValidation && dobValidation && contactNumberValidation && genderValidation && emailValidation && pwdValidation && confirmPwdValidation ){
            netflixUserCreated  = true;
            this.user = user;
        }
        return  netflixUserCreated;
    }

    public  void  getUserDetails(){
        System.out.println("First name : "+user.getFirstName());
        System.out.println("Last name : "+user.getLastName());
        System.out.println("Date of birth : "+user.getDob());
        System.out.println("Gender : "+user.getGender());
        System.out.println("Email : "+user.getEmail());
        System.out.println("Password : "+ user.getPwd());
        System.out.println("Confirm password : "+user.getConfirmPwd());
        System.out.println("Contact Number : "+user.getContactNumber());
    }

}
