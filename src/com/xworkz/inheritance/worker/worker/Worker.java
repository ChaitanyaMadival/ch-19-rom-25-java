package com.xworkz.inheritance.worker.worker;

import com.xworkz.inheritance.InheritanceRunner;

public class Worker extends InheritanceRunner {
    public Worker() {
        super();
        System.out.println("worker const is invoked");
    }

    public boolean produceCrop(){
        System.out.println("Produce Crop");
        return true;
    }
}
