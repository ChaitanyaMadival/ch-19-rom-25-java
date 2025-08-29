package com.xworkz.inheritance.cricket.cricketer;

import com.xworkz.inheritance.InheritanceRunner;

public class Cricketer extends InheritanceRunner {
    public Cricketer() {
        super();
        System.out.println("cricketer const is invoked");
    }

    public boolean playsCricket(){
        System.out.println("Plays Cricket");
        return true;
    }
}
