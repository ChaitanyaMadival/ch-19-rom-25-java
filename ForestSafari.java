class ForestSafari{

    int id;
    String name;
    String location;
    int numberOfAnimals;
    double areaInSqKm;
    boolean hasJeepSafari;

    public void getSafariDetails() {
        System.out.println("Safari ID: " +id);
        System.out.println("Name: " +name);
        System.out.println("Location: " +location);
        System.out.println("Number of Animals: " +numberOfAnimals);
        System.out.println("Area (sq km): " +areaInSqKm);
        System.out.println("Jeep Safari Available: " +hasJeepSafari);
        System.out.println("----------------------");
    }
}
