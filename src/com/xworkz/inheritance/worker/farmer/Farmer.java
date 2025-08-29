package com.xworkz.inheritance.worker.farmer;

import com.xworkz.inheritance.worker.worker.Worker;

public class Farmer extends Worker {

    public Farmer() {
        super();
        System.out.println("farmer const is invoked\n");
    }

    @Override
    public boolean produceCrop(){
        System.out.println("Produce Crop Based on the season");
        return true;
    }
}
