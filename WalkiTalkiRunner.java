class WalkiTalkiRunner {

    public static void main(String walki[]) {
        System.out.println("Main Started");

        String brand = WalkiTalki.getBrand();
        System.out.println("Brand: " + brand);

        double freq = WalkiTalki.getFrequencyRange();
        System.out.println("Frequency Range: " + freq + " MHz");

        int battery = WalkiTalki.getBatteryLife();
        System.out.println("Battery Life: " + battery + " hours");

        double weight = WalkiTalki.getWeight();
        System.out.println("Weight: " + weight + " grams");

        boolean rechargeable = WalkiTalki.getIsRechargeable();
        System.out.println("Is Rechargeable: " + rechargeable);

        String color = WalkiTalki.getColor();
        System.out.println("Color: " + color);

        System.out.println("Main Ended");
    }
}
