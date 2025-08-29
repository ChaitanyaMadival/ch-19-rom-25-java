package com.xworkz.inheritance.cellphone.device;

import com.xworkz.inheritance.InheritanceRunner;

public class Device extends InheritanceRunner {

    public Device(){
        super();
        System.out.println("device const is invoked");
    }


    public boolean doPhoneCall() {
        System.out.println("Do Phone Call");
        return true;
    }
}
