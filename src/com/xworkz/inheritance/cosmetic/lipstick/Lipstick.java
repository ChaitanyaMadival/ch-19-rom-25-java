package com.xworkz.inheritance.cosmetic.lipstick;

import com.xworkz.inheritance.cosmetic.cosmetic.Cosmetic;

public class Lipstick extends Cosmetic {
    public Lipstick() {
        super();
        System.out.println("lipstick const is invoked\n");
    }
    @Override
    public boolean sellBeautyProducts(){
        System.out.println("Sell Lipstick of different shades\n");
        return true;
    }
}
