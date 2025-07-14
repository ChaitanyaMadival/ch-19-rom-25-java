class Tyre {

    static String brand;
    static String type; 
    static double diameter; 
    static double price;
    static boolean isPunctureResistant;
    static String vehicleType;

    public static String getBrand() {
        brand = "MRF";
        return brand;
    }

    public static String getType() {
        type = "Tubeless";
        return type;
    }

    public static double getDiameter() {
        diameter = 17.5;
        return diameter;
    }

    public static double getPrice() {
        price = 4500.00;
        return price;
    }

    public static boolean getIsPunctureResistant() {
        isPunctureResistant = true;
        return isPunctureResistant;
    }

    public static String getVehicleType() {
        vehicleType = "Car";
        return vehicleType;
    }
}
