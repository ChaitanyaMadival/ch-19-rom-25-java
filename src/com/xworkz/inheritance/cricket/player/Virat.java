package com.xworkz.inheritance.cricket.player;

import com.xworkz.inheritance.cricket.cricketer.Cricketer;

public class Virat extends Cricketer {

    public Virat() {
        super();
        System.out.println("virat const is invoked\n");
    }

    @Override
    public boolean playsCricket(){
        System.out.println("Virat is the Best player\n");
        return true;
    }
}
