//package com.xworkz.instituteapp.validation;
//
//import com.xworkz.instituteapp.trainee.Trainee;
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
//
//public class TraineeValidation {
//
//    public  boolean validateTrainee(Trainee trainee){
//        boolean isTraineeValidated = false;
//
//        boolean traineeNameValidated = false;
//        boolean traineeIdValidated = false;
//        boolean genderValidated = false;
//        boolean dobValidated = false;
//        boolean phoneNumberValidated = false;
//        boolean emailValidated = false;
//
//
//        if(trainee.getTraineeName() != null && !trainee.getTraineeName().isEmpty()){
//            traineeNameValidated = true;
//        }else {
//            System.out.println("Trainee name is not valid/empty");
//        }
//        if(trainee.getTraineeId() != null && !trainee.getTraineeId().isEmpty()){
//            traineeIdValidated = true;
//        }else {
//            System.out.println("trainee id is not valid/empty");
//        }
//        if(trainee.getGender() != null && !trainee.getGender().isEmpty()){
//            genderValidated = true;
//        }else {
//            System.out.println("gender is not valid/empty");
//        }
//        if(trainee.getDob() != null && !trainee.getDob().isEmpty()){
//            dobValidated = true;
//        }else {
//            System.out.println("date of birth valid/empty");
//        }
//        if(trainee.getPhoneNumber() != null && !trainee.getPhoneNumber().isEmpty()){
//            phoneNumberValidated = true;
//        }else {
//            System.out.println("phone number is  not valid/empty");
//        }
//        if(trainee.getEmail() != null && !trainee.getEmail().isEmpty()){
//            emailValidated = true;
//        }else {
//            System.out.println("email is not valid/empty");
//        }
//        if(traineeIdValidated && traineeNameValidated && genderValidated && dobValidated && phoneNumberValidated && emailValidated){
//            isTraineeValidated = true;
//
//        }
//
//        return  isTraineeValidated;
//    }
//}
