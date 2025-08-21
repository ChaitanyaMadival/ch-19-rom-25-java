package com.xworkz.playstoreapp.store;

import com.xworkz.playstoreapp.user.User;
import com.xworkz.playstoreapp.validation.UserValidation;

public class Playsore {

    User user;

    public  boolean createUserInfo(User user){
        boolean isUserCreated = false;
        boolean validateUser;

        UserValidation userValid = new UserValidation();
        validateUser = userValid.validateUser(user);
        if(validateUser){
            isUserCreated = true;
            this.user = user;
        }

        return  isUserCreated;
    }

    public void getUserDetails() {
        System.out.println("User id : "+user.getUserId());
        System.out.println("First name : "+user.getFirstName());
        System.out.println("Middle name : "+user.getMiddleName());
        System.out.println("Sur name : "+user.getSurName());
        System.out.println("Gender : "+user.getGender());
        System.out.println("Date of birth : "+user.getDob());
        System.out.println("Age : "+user.getAge());
        System.out.println("Email : "+user.getEmail());
        System.out.println("Phone number : "+user.getPhoneNumber());
        System.out.println("Above User : "+user.getAboveEighteen());
        System.out.println("Address Pin code : "+user.getAddressPincode());
        System.out.println("Landmark : "+user.getLandmark());
        System.out.println("City : "+user.getCity());
        System.out.println("State : "+user.getState());
        System.out.println("City : "+user.getCity());
    }
}
