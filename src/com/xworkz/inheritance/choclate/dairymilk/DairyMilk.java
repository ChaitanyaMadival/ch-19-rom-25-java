package com.xworkz.inheritance.choclate.dairymilk;

import com.xworkz.inheritance.choclate.choclate.Chocolate;

public class DairyMilk extends Chocolate {

    public DairyMilk() {
        super();
        System.out.println("dairy milk const is invoked\n");
    }
    @Override
    public boolean manufactureChocolates(){
        System.out.println("Manufactures Chocolates of brand Dairy Milk");
        return true;
    }
}
