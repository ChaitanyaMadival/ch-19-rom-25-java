package com.xworkz.inheritance.businessman.tata;

import com.xworkz.inheritance.businessman.businessman.Businessman;

public class RatanTata extends Businessman {

    public RatanTata(){
        super();
        System.out.println("tata const is invoked\n");
    }

    @Override
    public boolean doBusiness(){
        System.out.println("Do Business on cars\n");
        return true;
    }
}
