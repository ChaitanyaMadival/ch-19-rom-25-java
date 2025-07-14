class Clothes {

    static String color;
    static String size;
    static String type;
    static String brand;
    static double price;
    static boolean isCotton;

    public static String getColor() {
        color = "Purple";
        return color;
    }

    public static String getSize() {
        size = "Small";
        return size;
    }

    public static String getType() {
        type = "Hoodie";
        return type;
    }

    public static String getBrand() {
        brand = "Puma";
        return brand;
    }

    public static double getPrice() {
        price = 999.99;
        return price;
    }

    public static boolean getIsCotton() {
        isCotton = true;
        return isCotton;
    }
}
