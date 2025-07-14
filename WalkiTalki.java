class WalkiTalki {

    static String brand;
    static double frequencyRange; 
    static int batteryLife; 
    static double weight; 
    static boolean isRechargeable;
    static String color;

    public static String getBrand() {
        brand = "Motorola";
        return brand;
    }

    public static double getFrequencyRange() {
        frequencyRange = 462.5625;
        return frequencyRange;
    }

    public static int getBatteryLife() {
        batteryLife = 12;
        return batteryLife;
    }

    public static double getWeight() {
        weight = 250.0;
        return weight;
    }

    public static boolean getIsRechargeable() {
        isRechargeable = true;
        return isRechargeable;
    }

    public static String getColor() {
        color = "Black";
        return color;
    }
}
