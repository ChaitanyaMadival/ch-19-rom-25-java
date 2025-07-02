class Theatre {
	
	static String theatreName;
    static String location;
    static int totalScreens;
    static int totalSeats;
    static boolean has3DProjection;
    static boolean hasImax;
    static String openingTime;
    static String closingTime;
    static String managerName;
    static String contactNumber;
    static boolean hasOnlineBooking;
    static boolean hasAc;
    static boolean hasReclinerSeats;
    static boolean hasFoodCourt;
    static int parkingCapacity;
    static boolean wheelChairAccessible;
    static int numberOfRestrooms;
    static String soundSystem;
    static int yearEstablished;
    static boolean hasBalconySeats;
	
	public static void main(String theatre[]) {
	
		System.out.println("Theatre Name: " + theatreName);
        System.out.println("Location: " + location);
        System.out.println("Total Screens: " + totalScreens);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("3D Projection: " + has3DProjection);
        System.out.println("IMAX Available: " + hasImax);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Online Booking: " + hasOnlineBooking);
        System.out.println("Air Conditioning: " + hasAc);
        System.out.println("Recliner Seats: " + hasReclinerSeats);
        System.out.println("Food Court Available: " + hasFoodCourt);
        System.out.println("Parking Capacity: " + parkingCapacity);
        System.out.println("Wheelchair Accessible: " + wheelChairAccessible);
        System.out.println("Number of Restrooms: " + numberOfRestrooms);
        System.out.println("Sound System: " + soundSystem);
        System.out.println("Year Established: " + yearEstablished);
        System.out.println("Balcony Seats: " + hasBalconySeats);
		
		System.out.println("-------           -------");
		
		theatreName = "CineWorld Multiplex";
		location = "JP Nagar, Bangalore";
		totalScreens = 5;
		totalSeats = 1200;
		has3DProjection = true;
		hasImax = false;
		openingTime = "9:00 AM";
		closingTime = "11:30 PM";
		managerName = "Sunil Verma";
		contactNumber = "+91-9876543210";
		hasOnlineBooking = true;
		hasAc = true;
		hasReclinerSeats = true;
		hasFoodCourt = true;
		parkingCapacity = 500;
		wheelChairAccessible = true;
		numberOfRestrooms = 12;
		soundSystem = "Dolby Atmos";
		yearEstablished = 2010;
		hasBalconySeats = false;
		
		System.out.println("Theatre Name: " + theatreName);
        System.out.println("Location: " + location);
        System.out.println("Total Screens: " + totalScreens);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("3D Projection: " + has3DProjection);
        System.out.println("IMAX Available: " + hasImax);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Online Booking: " + hasOnlineBooking);
        System.out.println("Air Conditioning: " + hasAc);
        System.out.println("Recliner Seats: " + hasReclinerSeats);
        System.out.println("Food Court Available: " + hasFoodCourt);
        System.out.println("Parking Capacity: " + parkingCapacity);
        System.out.println("Wheelchair Accessible: " + wheelChairAccessible);
        System.out.println("Number of Restrooms: " + numberOfRestrooms);
        System.out.println("Sound System: " + soundSystem);
        System.out.println("Year Established: " + yearEstablished);
        System.out.println("Balcony Seats: " + hasBalconySeats);
	}
}