package com.xworkz.inheritance.businessman.businessman;

import com.xworkz.inheritance.InheritanceRunner;

public class Businessman extends InheritanceRunner {
    public Businessman(){
        super();
        System.out.println("business man const is invoked");
    }

    public boolean doBusiness(){
        System.out.println("Do Business");
        return true;
    }
}
