class Fish {

    int id;
    String species;
    String habitat;
    double lengthInCm;
    double weightInKg;

    public void getFishDetails() {
        System.out.println("Fish ID: " + id);
        System.out.println("Species: " + species);
        System.out.println("Habitat: " + habitat);
        System.out.println("Length (cm): " + lengthInCm);
        System.out.println("Weight (kg): " + weightInKg);
        System.out.println("---------------");
    }
}
