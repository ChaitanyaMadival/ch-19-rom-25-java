package com.xworkz.inheritance.laptop.laptop;

import com.xworkz.inheritance.InheritanceRunner;

public class Laptop extends InheritanceRunner {
    public Laptop() {
        super();
        System.out.println("laptop const is invoked");
    }

    public boolean toCode(){
        System.out.println("Used for coding");
        return true;
    }
}
