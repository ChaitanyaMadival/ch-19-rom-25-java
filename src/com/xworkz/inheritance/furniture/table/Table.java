package com.xworkz.inheritance.furniture.table;

import com.xworkz.inheritance.furniture.furniture.Furnitature;

public class Table extends Furnitature {

    public Table() {
        super();
        System.out.println("table const is invoked\n");
    }

    @Override
    public boolean makeFurniture(){
        System.out.println("Manufacture Table");
        return true;
    }
}
