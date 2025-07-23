class Jewellery {
    int id;
    String type;
    double price;
    String material;
    boolean isAntique;
    String originCountry;

    public void getJewelleryDetails() {
        System.out.println("Jewellery ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Material: " + material);
        System.out.println("Is Antique: " + isAntique);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("------------");
    }
}
