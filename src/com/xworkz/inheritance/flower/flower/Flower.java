package com.xworkz.inheritance.flower.flower;

import com.xworkz.inheritance.InheritanceRunner;

public class Flower extends InheritanceRunner {
    public Flower() {
        super();
        System.out.println("flower constructor is invoked");
    }

    public boolean doDecoration(){
        System.out.println("Decorating god");
        return  true;
    }
}
