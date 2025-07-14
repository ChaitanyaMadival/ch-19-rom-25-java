class Garden {

    static String name;
    static String location;
    static int numberOfPlants;
    static double area; 
    static boolean hasFountain;
    static String famousFor;

    public static String getName() {
        name = "Lalbagh Botanical Garden";
        return name;
    }

    public static String getLocation() {
        location = "Bangalore";
        return location;
    }

    public static int getNumberOfPlants() {
        numberOfPlants = 5000;
        return numberOfPlants;
    }

    public static double getArea() {
        area = 240.0;
        return area;
    }

    public static boolean getHasFountain() {
        hasFountain = true;
        return hasFountain;
    }

    public static String getFamousFor() {
        famousFor = "Glass House Flower Show";
        return famousFor;
    }
}
