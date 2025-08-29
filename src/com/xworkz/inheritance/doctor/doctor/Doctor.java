package com.xworkz.inheritance.doctor.doctor;

import com.xworkz.inheritance.InheritanceRunner;

public class Doctor extends InheritanceRunner {

    public Doctor() {
        super();
        System.out.println("doctor const is invoked");
    }

    public boolean doTreatment(){
        System.out.println("Give Treatment");
        return true;
    }
}
