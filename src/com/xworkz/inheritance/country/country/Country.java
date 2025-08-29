package com.xworkz.inheritance.country.country;

import com.xworkz.inheritance.InheritanceRunner;

public class Country extends InheritanceRunner {
    public Country() {
        super();
        System.out.println("country const is invoked");
    }

    public boolean isMyCountry(){
        System.out.println("My Country");
        return true;
    }
}
