package com.xworkz.inheritance.medical.medicine;

import com.xworkz.inheritance.InheritanceRunner;

public class Medicine extends InheritanceRunner {

    public Medicine() {
        super();
        System.out.println("medicine const is invoked");
    }

    public boolean toCure(){
        System.out.println("To Cure");
        return true;
    }
}
