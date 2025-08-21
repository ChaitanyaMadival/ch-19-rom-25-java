package com.xworkz.googleapp.portal;

import com.xworkz.googleapp.user.GoogleUser;

public class GoogleValidation {
    GoogleUser user;

    public  boolean createGoogleUser(GoogleUser user){
        boolean googleUserCreated = false;

        boolean firstNameValidation = false;
        boolean lastNameValidation = false;
        boolean dobValidation = false;
        boolean genderValidation = false;
       // boolean contactNumberValidation = false;
        boolean passwordValidation = false;
         boolean conformPasswordValidation = false;


         if(user.getFirstName() != null){
             firstNameValidation = true;
         }else {
             System.out.println("First Name is not Valid");
         }
         if(user.getLastName() != null){
             lastNameValidation = true;
         }else {
             System.out.println("Lat name is not valid");
         }
        if(user.getDob() != null){
            dobValidation = true;
        }else{
            System.out.println("Date of birth is not valid");
        }
        if(user.getGender() != null){
            genderValidation = true;
        }else {
            System.out.println("Gender is not validated");
        }

         if(user.getContactNumber() > 0 ){
      //     contactNumberValidation = true;
         }else{
             System.out.println("Contact number is not valid");
         }
         if(user.getPwd() != null){
             passwordValidation = true;
         }else {
             System.out.println("Password is not valid");
         }
         if(user.getConformPassword() != null){
             conformPasswordValidation = true;
         }else {
             System.out.println("Conform password is not validated");
         }

         if(firstNameValidation && lastNameValidation && dobValidation && genderValidation && passwordValidation && conformPasswordValidation){
             googleUserCreated = true;
             this.user = user;
         }

         return  googleUserCreated;
    }

    public  void  getUserDetails(){
        System.out.println("First Name : "+user.getFirstName());
        System.out.println("Last Name : "+user.getLastName());
        System.out.println("Date of Birth : "+user.getDob());
        System.out.println("Gender : "+user.getGender());
        System.out.println("Contact Number : "+user.getContactNumber());
        System.out.println("Password : "+user.getPwd());
        System.out.println("Conform password : "+user.getConformPassword());

    }
}
