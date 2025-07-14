class GardenRunner {

    public static void main(String[] garden) {
        System.out.println("Main Started");

        String name = Garden.getName();
        System.out.println("Garden Name: " + name);

        String location = Garden.getLocation();
        System.out.println("Location: " + location);

        int plants = Garden.getNumberOfPlants();
        System.out.println("Number of Plants: " + plants);

        double area = Garden.getArea();
        System.out.println("Area: " + area + " sq.m");

        boolean fountain = Garden.getHasFountain();
        System.out.println("Has Fountain: " + fountain);

        String famous = Garden.getFamousFor();
        System.out.println("Famous For: " + famous);

        System.out.println("Main Ended");
    }
}
