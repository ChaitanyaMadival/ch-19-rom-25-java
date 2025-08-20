package com.xworkz.wireapp.wire;

public class Wire {


   // getters(accessor) & setter(mutators) = methods

    public  int getWireId(){
        return wireId;
    }

    public void setWireId(int wireId){
        this.wireId = 1;
    }

    public  String getWireBrand(){
        return wireBrand;
    }

    public void setWireBrand(String wireBrand) {
        this.wireBrand = wireBrand;
    }

    public int wireId;
    public  String color;
    //encapsulation
    private  String wireBrand;
    public  int wireLength;
    public  double price;
}
