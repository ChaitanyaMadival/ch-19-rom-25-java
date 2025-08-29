package com.xworkz.inheritance.hospital.hospital;

import com.xworkz.inheritance.InheritanceRunner;

public class Hospital extends InheritanceRunner {
    public Hospital() {
        super();
        System.out.println("hospital const is invoked");
    }

    public boolean treatPatient(){
        System.out.println("Treat Patient");
        return true;
    }
}
