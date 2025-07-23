class Rod {
    int rodId;
    String material;
    double length;
    String usage;
    boolean isFlexible;
    String manufacturer;

    public void getRodDetails() {
        System.out.println("Rod ID: " + rodId);
        System.out.println("Material: " + material);
        System.out.println("Length: " + length + " meters");
        System.out.println("Usage: " + usage);
        System.out.println("Is Flexible: " + isFlexible);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("---------------");
    }
}
