package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.Trainee;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Institute {
//    Trainee trainee;
//
//    public  boolean createTraineeInfo(Trainee trainee){
//        boolean isTraineeInfoCreated = false;
//
//        boolean isTraineeInfoValidated;
//        TraineeValidation traineeValid = new TraineeValidation();
//        isTraineeInfoValidated = traineeValid.validateTrainee(trainee);
//        if (isTraineeInfoValidated){
//            isTraineeInfoCreated = true;
//            this.trainee = trainee;
//        }
//
//        return  isTraineeInfoCreated;
//    }

    Trainee[] trainees = new Trainee[13];
    int index;

    public boolean addTrainee(Trainee trainee){
        boolean isTraineeAdded = false;

        if(trainees != null){
            trainees[index++] = trainee;
            isTraineeAdded = true;
        }else {
            System.out.println("Invalid trainee");
        }
        return isTraineeAdded;
    }


    public void fetchTraineeDetails() {

//        System.out.println("Name : "+trainees.getTraineeName());
//        System.out.println("Trainee Id : "+trainees.getTraineeId());
//        System.out.println("gender : "+trainees.getGender());
//        System.out.println("Date of birth : "+trainees.getDob());
//        System.out.println("Phone number : "+trainees.getPhoneNumber());
//        System.out.println("Email : "+trainees.getEmail());


        System.out.println("list of trainees are ..");

        for (Trainee trainee : trainees){
            System.out.println("Name : "+trainee.getTraineeName());
            System.out.println("Trainee Id : "+trainee.getTraineeId());
            System.out.println("gender : "+trainee.getGender());
            System.out.println("Date of birth : "+trainee.getDob());
            System.out.println("Phone number : "+trainee.getPhoneNumber());
            System.out.println("Email : "+trainee.getEmail());
            System.out.println("---------------------");
        }
    }
}
