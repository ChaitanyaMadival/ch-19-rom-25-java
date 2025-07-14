public class MakeUpKitRunner {

    public static void main(String[] makeup) {
        System.out.println("Main Started");

        String brand = MakeUpKit.getBrand();
        System.out.println("Brand: " + brand);

        int items = MakeUpKit.getNumberOfItems();
        System.out.println("Number of Items: " + items);

        double price = MakeUpKit.getPrice();
        System.out.println("Price: " + price);

        String theme = MakeUpKit.getColorTheme();
        System.out.println("Color Theme: " + theme);

        boolean waterproof = MakeUpKit.getIsWaterproof();
        System.out.println("Is Waterproof: " + waterproof);

        String skinType = MakeUpKit.getSkinType();
        System.out.println("Suitable for: " + skinType);

        System.out.println("Main Ended");
    }
}
