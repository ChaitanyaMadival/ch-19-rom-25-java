package com.xworkz.inheritance.utensil.utensil;

import com.xworkz.inheritance.InheritanceRunner;

public class Utensil extends InheritanceRunner {

    public Utensil() {
        super();
        System.out.println("utensil const is invoked");
    }

    public boolean toFeed(){
        System.out.println("To feed");
        return true;
    }
}
