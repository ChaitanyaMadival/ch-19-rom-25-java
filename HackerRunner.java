class HackerRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        String alias = Hacker.getAlias();
        System.out.println("Alias: " + alias);

        int age = Hacker.getAge();
        System.out.println("Age: " + age);

        String specialization = Hacker.getSpecialization();
        System.out.println("Specialization: " + specialization);

        boolean blackHat = Hacker.getIsBlackHat();
        System.out.println("Is Black Hat Hacker: " + blackHat);

        String country = Hacker.getCountry();
        System.out.println("Country: " + country);

        int hacks = Hacker.getNumberOfHacks();
        System.out.println("Number of Hacks: " + hacks);

        System.out.println("Main Ended");
    }
}
