package com.xworkz.inheritance.army.soldier;

import com.xworkz.inheritance.army.protector.Protector;

public class Soldier extends Protector {

    public Soldier(){
        super();
        System.out.println("soldier const is invoked \n");
    }

    @Override
    public boolean giveProtection(){
        System.out.println("Give Protection Only For Kashmir Region People\n");
        return true;
    }
}
