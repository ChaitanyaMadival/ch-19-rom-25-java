package com.xworkz.inheritance.flower.lotus;

import com.xworkz.inheritance.flower.flower.Flower;

public class Lotus extends Flower {

    public Lotus() {
        super();
        System.out.println("lotus const is invoked\n");
    }

    @Override
    public boolean doDecoration(){
        System.out.println("Decorating Lord Vishnu..\n");
        return  true;
    }
}
