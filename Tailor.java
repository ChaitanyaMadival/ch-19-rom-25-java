class Tailor {

    static String tailorName;
    static int experienceYears;
    static String specialty;
    static double hourlyRate;
    static boolean isAvailable;
    static String shopAddress;

    public static String getTailorName() {
        tailorName = "Ramesh";
        return tailorName;
    }

    public static int getExperienceYears() {
        experienceYears = 12;
        return experienceYears;
    }

    public static String getSpecialty() {
        specialty = "Custom Suits";
        return specialty;
    }

    public static double getHourlyRate() {
        hourlyRate = 500.0;
        return hourlyRate;
    }

    public static boolean getIsAvailable() {
        isAvailable = true;
        return isAvailable;
    }

    public static String getShopAddress() {
        shopAddress = "MG Road, Bangalore";
        return shopAddress;
    }
}
