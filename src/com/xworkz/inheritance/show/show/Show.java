package com.xworkz.inheritance.show.show;

import com.xworkz.inheritance.InheritanceRunner;

public class Show extends InheritanceRunner {
    public Show() {
        super();
        System.out.println("show const is invoked");
    }

    public boolean shareInformation(){
        System.out.println("Share Information");
        return true;
    }
}
