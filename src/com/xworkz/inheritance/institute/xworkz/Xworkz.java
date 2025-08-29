package com.xworkz.inheritance.institute.xworkz;

import com.xworkz.inheritance.institute.institution.Institution;

public class Xworkz extends Institution {

    public Xworkz() {
        super();
        System.out.println("xworkz const is invoked\n");
    }

    @Override
    public boolean provideGuidance(){
        System.out.println("Provide Guidance to Achieve Goal\n");
        return true;
    }
}
