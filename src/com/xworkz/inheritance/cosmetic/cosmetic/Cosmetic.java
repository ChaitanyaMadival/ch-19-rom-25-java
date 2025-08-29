package com.xworkz.inheritance.cosmetic.cosmetic;

import com.xworkz.inheritance.InheritanceRunner;

public class Cosmetic extends InheritanceRunner {

    public Cosmetic() {
        super();
        System.out.println("cosmetic const is invoked");
    }
    public boolean sellBeautyProducts(){
        System.out.println("Sell Beauty Products");
        return true;
    }
}
