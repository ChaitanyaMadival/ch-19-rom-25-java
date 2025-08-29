package com.xworkz.inheritance.vegitable.carrot;

import com.xworkz.inheritance.vegitable.vegitable.Vegetable;

public class Carrot extends Vegetable {

    public Carrot() {
        super();
        System.out.println("carrot const is invoked\n");
    }

    @Override
    public boolean makeSalad(){
        System.out.println("Make Carrot salad");
        return true;
    }
}
