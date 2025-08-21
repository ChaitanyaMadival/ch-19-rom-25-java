package com.xworkz.playstoreapp.validation;

import com.xworkz.playstoreapp.user.User;

public class UserValidation {

    public  boolean validateUser(User user){
        boolean isUserValidated = false;

        boolean userIdValidated = false;
        boolean firstNameValidated = false;
        boolean middleNameValidated = false;
        boolean surNameValidated = false;
        boolean genderValidated = false;
        boolean dobValidated = false;
        boolean ageValidated = false;
        boolean emailValidated = false;
        boolean phoneNumberValidated = false;
        boolean aboveEighteenValidated = false;
        boolean addressPincode = false;
        boolean landmarkValidated = false;
        boolean cityValidated = false;
        boolean stateValidated = false;
        boolean countryValidated = false;

        if(user.getUserId() != null && !user.getUserId().isEmpty()){
            userIdValidated = true;
        }else {
            System.out.println("user id is not valid");
        }
        if(user.getFirstName() != null && !user.getFirstName().isEmpty()){
            firstNameValidated = true;
        }else {
            System.out.println("first name is not valid");
        }
        if(user.getMiddleName() != null && !user.getMiddleName().isEmpty()){
            middleNameValidated = true;
        }else {
            System.out.println("middle name is not valid");
        }
        if(user.getSurName() != null && !user.getSurName().isEmpty()){
            surNameValidated = true;
        }else {
            System.out.println("surname is not valid");
        }
        if(user.getGender() != null && !user.getGender().isEmpty()){
            genderValidated = true;
        }else {
            System.out.println("gender is not valid");
        }
        if(user.getDob() != null && !user.getDob().isEmpty()){
            dobValidated = true;
        }else {
            System.out.println("dob is not valid");
        }
        if (user.getAge() != null && !user.getAge().isEmpty()){
            ageValidated = true;
        }else {
            System.out.println("age is not valid");
        }
        if(user.getEmail() != null && !user.getEmail().isEmpty()){
            emailValidated = true;
        }else {
            System.out.println("email is not valid");
        }
        if(user.getPhoneNumber() != null  && user.getPhoneNumber().length() == 10 ){
            phoneNumberValidated = true;
        }else {
            System.out.println("phone number is not valid");
        }
        if(user.getAboveEighteen() != null && !user.getAboveEighteen().isEmpty()){
            aboveEighteenValidated = true;
        }else {
            System.out.println("above eighteen is not valid");
        }
        if(user.getLandmark() != null && !user.getLandmark().isEmpty()){
            landmarkValidated = true;
        }else {
            System.out.println("landmark is not valid");
        }
        if(user.getAddressPincode() != null && !user.getAddressPincode().isEmpty()){
            addressPincode = true;
        }else {
            System.out.println("pin code is not valid");
        }
        if(user.getCity() != null && !user.getCity().isEmpty()){
            cityValidated = true;
        }else {
            System.out.println("city is not valid");
        }
        if(user.getState() != null && !user.getState().isEmpty()){
            stateValidated = true;
        }else {
            System.out.println("state is not valid");
        }
        if(user.getCountry() != null && !user.getCountry().isEmpty()){
            countryValidated = true;
        }else {
            System.out.println("country is not valid");
        }

        if(userIdValidated && firstNameValidated && middleNameValidated && surNameValidated && genderValidated && dobValidated && emailValidated && phoneNumberValidated && ageValidated && aboveEighteenValidated && addressPincode && landmarkValidated && cityValidated && stateValidated && countryValidated){
            isUserValidated = true;
        }else {
            System.out.println("user is not valid");
        }

        return  isUserValidated;

    }
}
