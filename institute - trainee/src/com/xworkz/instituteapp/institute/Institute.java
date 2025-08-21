package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.Trainee;
import com.xworkz.instituteapp.validation.TraineeValidation;

public class Institute {
    Trainee trainee;

    public  boolean createTraineeInfo(Trainee trainee){
        boolean isTraineeInfoCreated = false;

        boolean isTraineeInfoValidated;
        TraineeValidation traineeValid = new TraineeValidation();
        isTraineeInfoValidated = traineeValid.validateTrainee(trainee);
        if (isTraineeInfoValidated){
            isTraineeInfoCreated = true;
            this.trainee = trainee;
        }

        return  isTraineeInfoCreated;
    }

    public void fetchTraineeDetails() {
        System.out.println("Name : "+trainee.getTraineeName());
        System.out.println("Trainee Id : "+trainee.getTraineeId());
        System.out.println("gender : "+trainee.getGender());
        System.out.println("Date of birth : "+trainee.getDob());
        System.out.println("Phone number : "+trainee.getPhoneNumber());
        System.out.println("Email : "+trainee.getEmail());
    }
}
