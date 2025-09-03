package com.xworkz.instituteapp;

import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.trainee.Trainee;

public class InstituteRunner {

    public static void main(String[] args) {
        Trainee trainee = new Trainee();
        trainee.setTraineeId("1");
        trainee.setTraineeName("Chaitanya");
        trainee.setDob("21/07/2003");
        trainee.setEmail("chai@gmail.com");
        trainee.setGender("female");
        trainee.setPhoneNumber("7411348257");

        Trainee trainee1 = new Trainee();
        trainee1.setTraineeId("13");
        trainee1.setTraineeName("Pooja");
        trainee1.setDob("29/09/2003");
        trainee1.setEmail("pooja@gmail.com");
        trainee1.setGender("female");
        trainee1.setPhoneNumber("7110098765");

        Trainee trainee2 = new Trainee();
        trainee2.setTraineeId("2");
        trainee2.setTraineeName("Rahul");
        trainee2.setDob("15/03/2002");
        trainee2.setEmail("rahul@gmail.com");
        trainee2.setGender("male");
        trainee2.setPhoneNumber("9876543210");

        Trainee trainee3 = new Trainee();
        trainee3.setTraineeId("3");
        trainee3.setTraineeName("Sneha");
        trainee3.setDob("10/12/2001");
        trainee3.setEmail("sneha@gmail.com");
        trainee3.setGender("female");
        trainee3.setPhoneNumber("9123456780");

        Trainee trainee4 = new Trainee();
        trainee4.setTraineeId("4");
        trainee4.setTraineeName("Arjun");
        trainee4.setDob("01/01/2000");
        trainee4.setEmail("arjun@gmail.com");
        trainee4.setGender("male");
        trainee4.setPhoneNumber("9988776655");

        Trainee trainee5 = new Trainee();
        trainee5.setTraineeId("5");
        trainee5.setTraineeName("Meera");
        trainee5.setDob("25/09/2002");
        trainee5.setEmail("meera@gmail.com");
        trainee5.setGender("female");
        trainee5.setPhoneNumber("9001234567");

        Trainee trainee6 = new Trainee();
        trainee6.setTraineeId("6");
        trainee6.setTraineeName("Vikram");
        trainee6.setDob("30/06/2001");
        trainee6.setEmail("vikram@gmail.com");
        trainee6.setGender("male");
        trainee6.setPhoneNumber("1234567891");

        Trainee trainee7 = new Trainee();
        trainee7.setTraineeId("7");
        trainee7.setTraineeName("Aishwarya");
        trainee7.setDob("14/04/2003");
        trainee7.setEmail("aishwarya@gmail.com");
        trainee7.setGender("female");
        trainee7.setPhoneNumber("8777665544");

        Trainee trainee8 = new Trainee();
        trainee8.setTraineeId("8");
        trainee8.setTraineeName("Rohan");
        trainee8.setDob("19/08/2002");
        trainee8.setEmail("rohan@gmail.com");
        trainee8.setGender("male");
        trainee8.setPhoneNumber("7665544332");

        Trainee trainee9 = new Trainee();
        trainee9.setTraineeId("9");
        trainee9.setTraineeName("Divya");
        trainee9.setDob("05/11/2001");
        trainee9.setEmail("divya@gmail.com");
        trainee9.setGender("female");
        trainee9.setPhoneNumber("7554433221");

        Trainee trainee10 = new Trainee();
        trainee10.setTraineeId("10");
        trainee10.setTraineeName("Karan");
        trainee10.setDob("23/02/2000");
        trainee10.setEmail("karan@gmail.com");
        trainee10.setGender("male");
        trainee10.setPhoneNumber("7443322110");

        Trainee trainee11 = new Trainee();
        trainee11.setTraineeId("11");
        trainee11.setTraineeName("Neha");
        trainee11.setDob("17/07/2002");
        trainee11.setEmail("neha@gmail.com");
        trainee11.setGender("female");
        trainee11.setPhoneNumber("7332211009");

        Trainee trainee12 = new Trainee();
        trainee12.setTraineeId("12");
        trainee12.setTraineeName("Siddharth");
        trainee12.setDob("08/05/2001");
        trainee12.setEmail("sid@gmail.com");
        trainee12.setGender("male");
        trainee12.setPhoneNumber("7221100987");

        Institute institute = new Institute();
        institute.addTrainee(trainee);
        institute.addTrainee(trainee1);
        institute.addTrainee(trainee2);
        institute.addTrainee(trainee3);
        institute.addTrainee(trainee4);
        institute.addTrainee(trainee5);
        institute.addTrainee(trainee6);
        institute.addTrainee(trainee7);
        institute.addTrainee(trainee8);
        institute.addTrainee(trainee9);
        institute.addTrainee(trainee10);
        institute.addTrainee(trainee11);
        institute.addTrainee(trainee12);


       // institute.addTrainee();
        //        institute.createTraineeInfo(trainee);
        institute.fetchTraineeDetails();

    }
}
