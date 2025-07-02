class Court {
	
	static String courtName;
    static String location;
    static String courtType;
    static int numberOfJudges;
    static int numberOfCourtrooms;
    static boolean hasOnlineCaseAccess;
    static String jurisdiction;
    static int establishedYear;
    static boolean hasLegalAidCell;
    static int numberOfPendingCases;
    static String chiefJudge;
    static boolean hasCctv;
    static String workingHours;
    static boolean openOnSaturday;
    static String contactNumber;
    static boolean hasLibrary;
    static int totalStaff;
    static boolean hasPublicNoticeBoard;
    static String courtBuildingType;
    static boolean hasParkingFacility;
	
	public static void main(String court[]) {
	
		System.out.println("Court Name: " + courtName);
        System.out.println("Location: " + location);
        System.out.println("Court Type: " + courtType);
        System.out.println("Number of Judges: " + numberOfJudges);
        System.out.println("Number of Courtrooms: " + numberOfCourtrooms);
        System.out.println("Online Case Access: " + hasOnlineCaseAccess);
        System.out.println("Jurisdiction: " + jurisdiction);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Legal Aid Cell Available: " + hasLegalAidCell);
        System.out.println("Pending Cases: " + numberOfPendingCases);
        System.out.println("Chief Judge: " + chiefJudge);
        System.out.println("CCTV Installed: " + hasCctv);
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Open on Saturday: " + openOnSaturday);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Library Available: " + hasLibrary);
        System.out.println("Total Staff: " + totalStaff);
        System.out.println("Public Notice Board: " + hasPublicNoticeBoard);
        System.out.println("Building Type: " + courtBuildingType);
        System.out.println("Parking Facility: " + hasParkingFacility);
		
		System.out.println("-------           -------");
		
		courtName = "District Civil Court";
		location = "Chennai";
		courtType = "Civil";
		numberOfJudges = 8;
		numberOfCourtrooms = 10;
		hasOnlineCaseAccess = true;
		jurisdiction = "Chennai Urban";
		establishedYear = 1985;
		hasLegalAidCell = true;
		numberOfPendingCases = 5240;
		chiefJudge = "Justice Ananya Rao";
		hasCctv = true;
		workingHours = "10:00 AM to 5:00 PM";
		openOnSaturday = false;
		contactNumber = "9876543210";
		hasLibrary = true;
		totalStaff = 75;
		hasPublicNoticeBoard = true;
		courtBuildingType = "Government";
		hasParkingFacility = true;
		
		
		System.out.println("Court Name: " + courtName);
        System.out.println("Location: " + location);
        System.out.println("Court Type: " + courtType);
        System.out.println("Number of Judges: " + numberOfJudges);
        System.out.println("Number of Courtrooms: " + numberOfCourtrooms);
        System.out.println("Online Case Access: " + hasOnlineCaseAccess);
        System.out.println("Jurisdiction: " + jurisdiction);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Legal Aid Cell Available: " + hasLegalAidCell);
        System.out.println("Pending Cases: " + numberOfPendingCases);
        System.out.println("Chief Judge: " + chiefJudge);
        System.out.println("CCTV Installed: " + hasCctv);
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Open on Saturday: " + openOnSaturday);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Library Available: " + hasLibrary);
        System.out.println("Total Staff: " + totalStaff);
        System.out.println("Public Notice Board: " + hasPublicNoticeBoard);
        System.out.println("Building Type: " + courtBuildingType);
        System.out.println("Parking Facility: " + hasParkingFacility);
	}
}