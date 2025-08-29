package com.xworkz.inheritance.hero.actor;

import com.xworkz.inheritance.InheritanceRunner;

public class Actor extends InheritanceRunner {
    public Actor() {
        super();
        System.out.println("actor const is invoked");
    }

    public boolean doActing(){
        System.out.println("Do Acting");
        return true;
    }
}
