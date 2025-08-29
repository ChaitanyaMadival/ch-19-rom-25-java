package com.xworkz.inheritance.country.india;

import com.xworkz.inheritance.country.country.Country;

public class India extends Country {
    public India() {
        super();
        System.out.println("India const is invoked\n");
    }

    @Override
    public boolean isMyCountry(){
        System.out.println("India is My Country");
        return true;
    }
}
