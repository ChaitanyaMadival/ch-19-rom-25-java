public class Fish {
    int id;
    String species;
    String habitat;
    double lengthInCm;
    double weightInKg;

    public Fish(int id, String species, String habitat, double lengthInCm, double weightInKg) {
        this.id = id;
        this.species = species;
        this.habitat = habitat;
        this.lengthInCm = lengthInCm;
        this.weightInKg = weightInKg;
    }

    public void getFishDetails() {
        System.out.println("Fish ID: " + id);
        System.out.println("Species: " + species);
        System.out.println("Habitat: " + habitat);
        System.out.println("Length (cm): " + lengthInCm);
        System.out.println("Weight (kg): " + weightInKg);
        System.out.println("-----------------------");
    }
}
