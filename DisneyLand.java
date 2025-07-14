class DisneyLand {

    static String location;
    static int numberOfRides;
    static double entryFee;
    static boolean hasFireworksShow;
    static String mostFamousCharacter;
    static double area; // in acres

    public static String getLocation() {
        location = "California, USA";
        return location;
    }

    public static int getNumberOfRides() {
        numberOfRides = 58;
        return numberOfRides;
    }

    public static double getEntryFee() {
        entryFee = 150.00;
        return entryFee;
    }

    public static boolean getHasFireworksShow() {
        hasFireworksShow = true;
        return hasFireworksShow;
    }

    public static String getMostFamousCharacter() {
        mostFamousCharacter = "Mickey Mouse";
        return mostFamousCharacter;
    }

    public static double getArea() {
        area = 500.0;
        return area;
    }
}
