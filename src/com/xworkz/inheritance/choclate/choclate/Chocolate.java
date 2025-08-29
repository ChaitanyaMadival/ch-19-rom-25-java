package com.xworkz.inheritance.choclate.choclate;

import com.xworkz.inheritance.InheritanceRunner;

public class Chocolate extends InheritanceRunner {

    public Chocolate() {
        super();
        System.out.println("chocolate const is invoked");
    }

    public boolean manufactureChocolates(){
        System.out.println("Manufactures Chocolates");
        return true;
    }
}
