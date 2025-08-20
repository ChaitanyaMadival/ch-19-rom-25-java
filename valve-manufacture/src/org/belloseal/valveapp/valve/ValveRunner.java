package org.belloseal.valveapp.valve;

public class ValveRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Valve valve = new Valve();

        valve.setValveId(1);
        valve.setBrand("Belloseal");
        valve.setPrice(599.99);

        int valveId = valve.getValveId();
        String brand = valve.getBrand();
        double price = valve.getPrice();

        System.out.println("Valve ID: "+valveId);
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);

        System.out.println("main ended");
    }
}
