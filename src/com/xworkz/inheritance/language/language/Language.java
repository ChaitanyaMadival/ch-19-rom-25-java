package com.xworkz.inheritance.language.language;

import com.xworkz.inheritance.InheritanceRunner;

public class Language extends InheritanceRunner {
    public Language() {
        super();
        System.out.println("language const is invoked");
    }

    public boolean toSpeak(){
        System.out.println("For Communication");
        return true;
    }
}
