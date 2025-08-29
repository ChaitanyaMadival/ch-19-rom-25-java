package com.xworkz.inheritance.vegitable.vegitable;

import com.xworkz.inheritance.InheritanceRunner;

public class Vegetable extends InheritanceRunner {

    public Vegetable() {
        super();
        System.out.println("vegetable const is invoked");
    }

    public boolean makeSalad(){
        System.out.println("Make Vegetable salad");
        return true;
    }
}
