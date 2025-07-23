class Crackers{

    int id;
    String brandName;
    int weight;          
    String flavor;
    String packageType;
    int price;          

    public void getCrackerDetails() {
        System.out.println("Cracker ID: " + id);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Weight (g): " + weight);
        System.out.println("Flavor: " + flavor);
        System.out.println("Package Type: " + packageType);
        System.out.println("Price: " + price);
        System.out.println("---------------");
    }
}
