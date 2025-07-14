public class ClothesRunner {

    public static void main(String cloth[]) {
        System.out.println("Main Started");

        String color = Clothes.getColor();
        System.out.println("Color of the clothes: " +color);

        String size = Clothes.getSize();
        System.out.println("Size: " +size);

        String type = Clothes.getType();
        System.out.println("Type: " +type);

        String brand = Clothes.getBrand();
        System.out.println("Brand: " +brand);

        double price = Clothes.getPrice();
        System.out.println("Price: " +price);

        boolean isCotton = Clothes.getIsCotton();
        System.out.println("Is made of cotton: " +isCotton);

        System.out.println("Main Ended");
    }
}
