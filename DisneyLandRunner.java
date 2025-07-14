class DisneyLandRunner {

    public static void main(String disney[]) {
        System.out.println("Main Started");

        String location = DisneyLand.getLocation();
        System.out.println("Location: " + location);

        int rides = DisneyLand.getNumberOfRides();
        System.out.println("Number of Rides: " + rides);

        double fee = DisneyLand.getEntryFee();
        System.out.println("Entry Fee: $" + fee);

        boolean fireworks = DisneyLand.getHasFireworksShow();
        System.out.println("Fireworks Show Available: " + fireworks);

        String character = DisneyLand.getMostFamousCharacter();
        System.out.println("Most Famous Character: " + character);

        double area = DisneyLand.getArea();
        System.out.println("Park Area: " + area + " acres");

        System.out.println("Main Ended");
    }
}
