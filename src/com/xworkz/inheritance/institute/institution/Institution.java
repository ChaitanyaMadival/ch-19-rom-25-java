package com.xworkz.inheritance.institute.institution;

import com.xworkz.inheritance.InheritanceRunner;

public class Institution extends InheritanceRunner {

    public Institution() {
        super();
        System.out.println("institute const is invoked");
    }

    public boolean provideGuidance(){
        System.out.println("Provide Path to Achieve Goals");
        return true;
    }
}
