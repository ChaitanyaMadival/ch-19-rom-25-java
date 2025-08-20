package org.belloseal.valveapp.valve;

public class Valve {
    private int valveId;
   private  String brand;
   private  double price;

    public int getValveId() {
        return valveId;
    }
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setValveId(int valveId) {
        this.valveId = valveId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
