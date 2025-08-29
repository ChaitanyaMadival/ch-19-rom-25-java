package com.xworkz.inheritance.cellphone.phone;

import com.xworkz.inheritance.cellphone.device.Device;

public class Phone extends Device {

    public Phone(){
        super();
        System.out.println("Phone const is invoked\n");
    }

    @Override
    public boolean doPhoneCall() {
        System.out.println("Do Phone Call For My Friend\n");
        return true;
    }
}
