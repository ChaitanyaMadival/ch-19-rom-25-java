package com.xworkz.inheritance.stationary.shrihari;

import com.xworkz.inheritance.stationary.stationary.Stationery;

public class SriHari extends Stationery {
    public SriHari() {
        super();
        System.out.println("sri hari const is invoked\n");
    }

    @Override
    public boolean sellItems(){
        System.out.println("Sell paints and pens");
        return true;
    }
}
