class TyreRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        String brand = Tyre.getBrand();
        System.out.println("Tyre Brand: " + brand);

        String type = Tyre.getType();
        System.out.println("Tyre Type: " + type);

        double diameter = Tyre.getDiameter();
        System.out.println("Diameter: " + diameter + " inches");

        double price = Tyre.getPrice();
        System.out.println("Price: " + price);

        boolean resistant = Tyre.getIsPunctureResistant();
        System.out.println("Puncture Resistant: " + resistant);

        String vehicle = Tyre.getVehicleType();
        System.out.println("Vehicle Type: " + vehicle);

        System.out.println("Main Ended");
    }
}
