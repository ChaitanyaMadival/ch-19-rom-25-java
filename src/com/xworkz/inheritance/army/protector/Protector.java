package com.xworkz.inheritance.army.protector;

import com.xworkz.inheritance.InheritanceRunner;

public class Protector extends InheritanceRunner  {

    public  Protector(){
        super();
        System.out.println("protector const is invoked");
    }

    public boolean giveProtection(){
        System.out.println("Give Protection");
        return true;
    }
}
