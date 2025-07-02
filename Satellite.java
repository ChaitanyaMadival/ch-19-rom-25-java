class Satellite {
	
	static String satelliteName;
    static String country;
    static String organization;
    static String satelliteType;
    static double mass; 
    static double height; 
    static boolean isActive;
    static String launchVehicle;
    static String launchDate;
    static String orbitType";
    static double orbitAltitude; 
    static double speed; 
    static int powerCapacity; 
    static int transponderCount;
    static String missionPurpose;
    static int lifeSpanYears;
    static boolean hasSolarPanels;
    static boolean hasImagingSystem;
    static String groundStation;
    static boolean underControl;
	
	public static void main(String satellite[]) {
	
		System.out.println("Satellite Name: " + satelliteName);
        System.out.println("Country: " + country);
        System.out.println("Organization: " + organization);
        System.out.println("Satellite Type: " + satelliteType);
        System.out.println("Mass: " + mass + " kg");
        System.out.println("Height: " + height + " m");
        System.out.println("Is Active: " + isActive);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Orbit Altitude: " + orbitAltitude + " km");
        System.out.println("Speed: " + speed + " km/s");
        System.out.println("Power Capacity: " + powerCapacity + " W");
        System.out.println("Transponder Count: " + transponderCount);
        System.out.println("Mission Purpose: " + missionPurpose);
        System.out.println("Life Span: " + lifeSpanYears + " years");
        System.out.println("Solar Panels: " + hasSolarPanels);
        System.out.println("Imaging System: " + hasImagingSystem);
        System.out.println("Ground Station: " + groundStation);
        System.out.println("Under Control: " + underControl);
		
		System.out.println("-------           -------");
		
		satelliteName = "INSAT-4B";
		country = "India";
		organization = "ISRO";
		satelliteType = "Communication";
		mass = 3025.0; 
		height = 3.1; 
		isActive = true;
		launchVehicle = "GSLV-F04";
		launchDate = "March 12, 2007";
		orbitType = "Geostationary";
		orbitAltitude = 35786.0; 
		speed = 3.07; 
		powerCapacity = 6020; 
		transponderCount = 12;
		missionPurpose = "TV, Radio, Telecommunication Services";
		lifeSpanYears = 12;
		hasSolarPanels = true;
		hasImagingSystem = false;
		groundStation = "Master Control Facility, Hassan";
		underControl = true;
		
		
		System.out.println("Satellite Name: " + satelliteName);
        System.out.println("Country: " + country);
        System.out.println("Organization: " + organization);
        System.out.println("Satellite Type: " + satelliteType);
        System.out.println("Mass: " + mass + " kg");
        System.out.println("Height: " + height + " m");
        System.out.println("Is Active: " + isActive);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Orbit Altitude: " + orbitAltitude + " km");
        System.out.println("Speed: " + speed + " km/s");
        System.out.println("Power Capacity: " + powerCapacity + " W");
        System.out.println("Transponder Count: " + transponderCount);
        System.out.println("Mission Purpose: " + missionPurpose);
        System.out.println("Life Span: " + lifeSpanYears + " years");
        System.out.println("Solar Panels: " + hasSolarPanels);
        System.out.println("Imaging System: " + hasImagingSystem);
        System.out.println("Ground Station: " + groundStation);
        System.out.println("Under Control: " + underControl);
		
	}
}