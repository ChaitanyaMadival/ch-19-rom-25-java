package com.xworkz.amazonapp.validation;

import com.xworkz.amazonapp.user.AmzonUser;

public class AmazonUserValidation {
    AmzonUser user;

    public  boolean createAmazonUser(AmzonUser user){
        boolean amazonUserCreated = false;

        boolean emailValidation = false;
        boolean usernameValidation = false;
        boolean passwordValidation = false;
        boolean confirmPassword = false;
      //  boolean phoneNumberValidation = false;
        boolean dobValidation = false;



        if(user.getEmail() != null){
            emailValidation = true;
        }
        else{
            System.out.println("Email is not valid");
        }
        if(user.getUserName() != null){
            usernameValidation = true;
        }else{
            System.out.println("Use Name is not valid");
        }
        if(user.getPassword() != null){
            passwordValidation = true;
        }else{
            System.out.println("Password is not valid");
        }
        if(user.getConformPassword() != null){
            confirmPassword = true;
        }else {
            System.out.println("Conform password is not valid");
        }

        //only for object refernce the validation will be check to the null -(default value)
        if(user.getPhoneNumber() > 0){
           // phoneNumberValidation = true;
        }else{
            System.out.println("Phone Number is not Valid");
        }
        if(user.getDob() != null){
            dobValidation = true;
        }else{
            System.out.println("Date of birth is not valid");
        }

        if(emailValidation && usernameValidation && passwordValidation && confirmPassword && dobValidation ){
            amazonUserCreated = true;
            this.user = user;
        }
        return amazonUserCreated;
    }

    public  void  getUserDetails(){
        System.out.println("Email : "+user.getEmail());
        System.out.println("User Name : "+user.getUserName());
        System.out.println("Password: "+user.getPassword());
        System.out.println("Conform Password : "+user.getConformPassword());
        System.out.println("Phone number : "+user.getPhoneNumber());
        System.out.println("Date of Birth : "+user.getDob());
    }

}
