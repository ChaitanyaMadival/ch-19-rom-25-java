package com.xworkz.wireapp;
import com.xworkz.wireapp.wire.Wire;

public class WireRunner {

    public static void main(String args[]) {
        System.out.println("Main started");
        Wire wire = new Wire();
        wire.wireId = 1;
        wire.color = "Blue";
        wire.wireBrand = "Philips";
        wire.price = 50.2;
        wire.wireLength = 10;

        wire.setWireId(1);
        wire.setWireBrand("finolex");
        int wireId = wire.getWireId();

        System.out.println("Wire Id: "+wire.wireId);

        
        System.out.println("Color of Wire: "+wire.color);
        System.out.println("Brand: "+wire.wireBrand);
        System.out.println("Price: "+wire.price);
        System.out.println("Length of wire: "+wire.wireLength);
        System.out.println("Main Ended");
    }
}
