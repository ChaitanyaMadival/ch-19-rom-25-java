package com.xworkz.inheritance.cloth.cloth;

import com.xworkz.inheritance.InheritanceRunner;

public class Cloth extends InheritanceRunner {

    public Cloth() {
        super();
        System.out.println("cloth const is invoked");
    }

    public  boolean produceCloth(){
        System.out.println("Manufacture cloths");
        return true;
    }
}
