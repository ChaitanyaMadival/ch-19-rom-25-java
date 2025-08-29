package com.xworkz.inheritance.laptop.hp;

import com.xworkz.inheritance.laptop.laptop.Laptop;

public class Hp extends Laptop {
    public Hp() {
        super();
        System.out.println("hp const is invoked\n");
    }

    @Override
    public boolean toCode(){
        System.out.println("Used by developers to code\n");
        return true;
    }
}
