class Crackers {
    int id;
    String brandName;
    int weight;
    String flavor;
    String packageType;
    int price;

    Crackers(int id, String brandName, int weight, String flavor, String packageType, int price) {
        this.id = id;
        this.brandName = brandName;
        this.weight = weight;
        this.flavor = flavor;
        this.packageType = packageType;
        this.price = price;
    }

    void getCrackerDetails() {
        System.out.println("ID: " + id);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Flavor: " + flavor);
        System.out.println("Package Type: " + packageType);
        System.out.println("Price: " + price);
        System.out.println("----------------");
    }
}
