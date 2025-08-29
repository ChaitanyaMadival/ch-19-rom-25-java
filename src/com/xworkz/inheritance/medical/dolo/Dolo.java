package com.xworkz.inheritance.medical.dolo;

import com.xworkz.inheritance.medical.medicine.Medicine;

public class Dolo extends Medicine {
    public Dolo() {
        super();
        System.out.println("dolo const is invoked\n");
    }

    @Override
    public boolean toCure(){
        System.out.println("To Cure Fever\n");
        return true;
    }
}
