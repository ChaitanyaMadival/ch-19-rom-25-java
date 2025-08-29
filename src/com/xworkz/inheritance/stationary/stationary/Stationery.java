package com.xworkz.inheritance.stationary.stationary;

import com.xworkz.inheritance.InheritanceRunner;

public class Stationery extends InheritanceRunner {
    public Stationery() {
        super();
        System.out.println("stationery const is invoked");
    }

    public boolean sellItems(){
        System.out.println("Sell Items");
        return true;
    }
}
