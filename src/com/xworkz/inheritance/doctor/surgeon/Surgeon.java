package com.xworkz.inheritance.doctor.surgeon;

import com.xworkz.inheritance.doctor.doctor.Doctor;

public class Surgeon extends Doctor {
    public Surgeon() {
        super();
        System.out.println("surgeon const is invoked\n");
    }

    @Override
    public boolean doTreatment(){
        System.out.println("Do Heart Surgeries");
        return true;
    }
}
