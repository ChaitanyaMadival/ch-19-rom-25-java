public class Cigrate {
    int id;
    String brand;
    String type;
    String countryOfOrigin;
    String packaging;
	
    public Cigrate(int id, String brand, String type, String countryOfOrigin, String packaging) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.countryOfOrigin = countryOfOrigin;
        this.packaging = packaging;
    }

    public void getCigrateDetails() {
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Packaging: " + packaging);
        System.out.println("-----------------");
    }
}
