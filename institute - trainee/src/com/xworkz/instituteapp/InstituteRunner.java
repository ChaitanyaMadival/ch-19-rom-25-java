package com.xworkz.instituteapp;

import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.trainee.Trainee;
import com.xworkz.instituteapp.validation.TraineeValidation;

public class InstituteRunner {

    public static void main(String[] args) {
        Trainee trainee = new Trainee();
        trainee.setTraineeId("1C7");
        trainee.setTraineeName("Chaitanya");
        trainee.setDob("21/072003");
        trainee.setEmail("chaitanya@gmail.com");
        trainee.setGender("female");
        trainee.setPhoneNumber("7411348257");


        Institute institute = new Institute();
        institute.createTraineeInfo(trainee);
        institute.fetchTraineeDetails();
    }
}
