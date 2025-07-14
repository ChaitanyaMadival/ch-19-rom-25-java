public class TailorRunner {

    public static void main(String tailor[]) {
        System.out.println("Main Started");

        String name = Tailor.getTailorName();
        System.out.println("Tailor Name: " + name);

        int experience = Tailor.getExperienceYears();
        System.out.println("Experience (Years): " + experience);

        String specialty = Tailor.getSpecialty();
        System.out.println("Specialty: " + specialty);

        double rate = Tailor.getHourlyRate();
        System.out.println("Hourly Rate: " + rate);

        boolean available = Tailor.getIsAvailable();
        System.out.println("Is Available: " + available);

        String address = Tailor.getShopAddress();
        System.out.println("Shop Address: " + address);

        System.out.println("Main Ended");
    }
}
