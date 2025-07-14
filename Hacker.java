class Hacker {

    static String alias;
    static int age;
    static String specialization;
    static boolean isBlackHat;
    static String country;
    static int numberOfHacks;

    public static String getAlias() {
        alias = "ShadowFox";
        return alias;
    }

    public static int getAge() {
        age = 28;
        return age;
    }

    public static String getSpecialization() {
        specialization = "Network Penetration";
        return specialization;
    }

    public static boolean getIsBlackHat() {
        isBlackHat = false;
        return isBlackHat;
    }

    public static String getCountry() {
        country = "Germany";
        return country;
    }

    public static int getNumberOfHacks() {
        numberOfHacks = 42;
        return numberOfHacks;
    }
}
