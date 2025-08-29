package com.xworkz.inheritance.hospital.apollo;

import com.xworkz.inheritance.hospital.hospital.Hospital;

public class Apollo extends Hospital {
    public Apollo() {
        super();
        System.out.println("apollo const is invoked\n");
    }

    @Override
    public boolean treatPatient(){
        System.out.println("Treat Patient and care 24/7 \n");
        return true;
    }
}
