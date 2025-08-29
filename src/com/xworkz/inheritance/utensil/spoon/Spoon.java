package com.xworkz.inheritance.utensil.spoon;

import com.xworkz.inheritance.utensil.utensil.Utensil;

public class Spoon extends Utensil {
    public Spoon() {
        super();
        System.out.println("spoon const is invoked\n");
    }

    @Override
    public boolean toFeed(){
        System.out.println("To feed hot soup\n");
        return true;
    }
}
