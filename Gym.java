class Gym {
	
	static String gymName;
    static String location;
    static int totalMembers;
    static int totalTrainers;
    static boolean is24HoursOpen;
    static String ownerName;
    static int monthlyFee;
    static int yearlyFee;
    static boolean hasPersonalTraining;
    static boolean hasDietConsultation;
    static int numberOfTreadmills;
    static int numberOfCycles;
    static int numberOfWeightMachines;
    static boolean hasSwimmingPool;
    static boolean hasSteamRoom;
    static String gymType;
    static boolean hasZumbaClasses;
    static String openTime;
    static String closeTime;
    static String contactNumber;
	
	public static void main(String gym[]) {
	
		System.out.println("Gym Name: " + gymName);
        System.out.println("Location: " + location);
        System.out.println("Total Members: " + totalMembers);
        System.out.println("Total Trainers: " + totalTrainers);
        System.out.println("Open 24 Hours: " + is24HoursOpen);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Monthly Fee: ₹" + monthlyFee);
        System.out.println("Yearly Fee: ₹" + yearlyFee);
        System.out.println("Personal Training Available: " + hasPersonalTraining);
        System.out.println("Diet Consultation Available: " + hasDietConsultation);
        System.out.println("Treadmills: " + numberOfTreadmills);
        System.out.println("Cycles: " + numberOfCycles);
        System.out.println("Weight Machines: " + numberOfWeightMachines);
        System.out.println("Swimming Pool Available: " + hasSwimmingPool);
        System.out.println("Steam Room Available: " + hasSteamRoom);
        System.out.println("Gym Type: " + gymType);
        System.out.println("Zumba Classes Available: " + hasZumbaClasses);
        System.out.println("Opening Time: " + openTime);
        System.out.println("Closing Time: " + closeTime);
        System.out.println("Contact Number: " + contactNumber);
		
		System.out.println("-------          -------");
		
		gymName = "FitZone Gym";
		location = "MG Road, Bangalore";
		totalMembers = 350;
		totalTrainers = 12;
		is24HoursOpen = false;
		ownerName = "Ullas Prabhakar";
		monthlyFee = 1500;
		yearlyFee = 15000;
		hasPersonalTraining = true;
		hasDietConsultation = true;
		numberOfTreadmills = 8;
		numberOfCycles = 6;
		numberOfWeightMachines = 25;
		hasSwimmingPool = false;
		hasSteamRoom = true;
		gymType = "Unisex";
		hasZumbaClasses = true;
		openTime = "6:00 AM";
		closeTime = "10:00 PM";
		contactNumber = "9876543210";
		
		System.out.println("Gym Name: " + gymName);
        System.out.println("Location: " + location);
        System.out.println("Total Members: " + totalMembers);
        System.out.println("Total Trainers: " + totalTrainers);
        System.out.println("Open 24 Hours: " + is24HoursOpen);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Monthly Fee: " + monthlyFee);
        System.out.println("Yearly Fee: " + yearlyFee);
        System.out.println("Personal Training Available: " + hasPersonalTraining);
        System.out.println("Diet Consultation Available: " + hasDietConsultation);
        System.out.println("Treadmills: " + numberOfTreadmills);
        System.out.println("Cycles: " + numberOfCycles);
        System.out.println("Weight Machines: " + numberOfWeightMachines);
        System.out.println("Swimming Pool Available: " + hasSwimmingPool);
        System.out.println("Steam Room Available: " + hasSteamRoom);
        System.out.println("Gym Type: " + gymType);
        System.out.println("Zumba Classes Available: " + hasZumbaClasses);
        System.out.println("Opening Time: " + openTime);
        System.out.println("Closing Time: " + closeTime);
        System.out.println("Contact Number: " + contactNumber);
	}
}