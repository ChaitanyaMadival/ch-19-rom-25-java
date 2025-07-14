class GamingPc {

    static String processor;
    static int ramSize; 
    static String graphicsCard;
    static double price; 
    static boolean hasRGBLighting;
    static String brand;

    public static String getProcessor() {
        processor = "Intel Core i9";
        return processor;
    }

    public static int getRamSize() {
        ramSize = 32;
        return ramSize;
    }

    public static String getGraphicsCard() {
        graphicsCard = "NVIDIA RTX 4090";
        return graphicsCard;
    }

    public static double getPrice() {
        price = 250000.00;
        return price;
    }

    public static boolean getHasRGBLighting() {
        hasRGBLighting = true;
        return hasRGBLighting;
    }

    public static String getBrand() {
        brand = "Alienware";
        return brand;
    }
}
