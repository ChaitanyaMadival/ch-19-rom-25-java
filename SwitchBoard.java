class SwitchBoard {
	
	static int voltage;
	static int numberOfSwitches;
	static String brand;
	static boolean  isMainPowerOn;
	static double frequency;
	static int noOfConnectedDevices;
	static long serialNumber;
	static float currentRating;
	static boolean isSmart;
	static String location;
	static int maxLoad;
	static boolean hasSurgeProtection;
	static int yearManufactured;
	static String safetyRating;
	static int warrantyYears;
	static int indicatorLeds;
	static boolean energySaverMode;
	static double powerConsumption;
	static String color;
	static boolean isChildLockEnabled; 
	
	public static void main(String board[]) {
	
		System.out.println("Voltage: "+voltage);
		System.out.println("Number of Switches: "+numberOfSwitches);
		System.out.println("Brand: " + brand);
		System.out.println("Main Power On: " + isMainPowerOn);
		System.out.println("Frequency: " + frequency);
		System.out.println("Number of Connected Devices: ");
		System.out.println("Serial Number: " + serialNumber);
		System.out.println("Current Rating: " + currentRating);
		System.out.println("Is Smart: " + isSmart);
		System.out.println("Location: " + location);
		System.out.println("Max Load: " + maxLoad);
		System.out.println("Has Surge Protection: " + hasSurgeProtection);
		System.out.println("Year Manufactured: " + yearManufactured);
		System.out.println("Safety Rating: " + safetyRating);
		System.out.println("Warranty Years: " + warrantyYears);
		System.out.println("Indicator LEDs: " + indicatorLeds);
		System.out.println("Energy Saver Mode: " + energySaverMode);
		System.out.println("Self-Power Consumption: " + powerConsumption);
		System.out.println("Color: " + color);
		System.out.println("Child-Lock Enabled: " + isChildLockEnabled);
		
		System.out.println("-------           -------");
		
		voltage = 220;
		numberOfSwitches = 8;
		brand = "Electro Lite";
		isMainPowerOn = true;
		frequency = 50.0;
		noOfConnectedDevices = 3;
		serialNumber = 202506220001L;
		currentRating = 15.5f;
		isSmart = true;
		location = "Living Room";
		maxLoad = 3000;
		hasSurgeProtection = true;
		yearManufactured = 2025;
		safetyRating = "B+";
		warrantyYears = 3;
		indicatorLeds = 4;
		energySaverMode = false;
		powerConsumption = 2.3;
		color = "White";
		isChildLockEnabled = false; 
		
		System.out.println("Voltage: "+voltage);
		System.out.println("Number of Switches: "+numberOfSwitches);
		System.out.println("Brand: " + brand);
		System.out.println("Main Power On: " + isMainPowerOn);
		System.out.println("Frequency: " + frequency);
		System.out.println("Number of Connected Devices: ");
		System.out.println("Serial Number: " + serialNumber);
		System.out.println("Current Rating: " + currentRating);
		System.out.println("Is Smart: " + isSmart);
		System.out.println("Location: " + location);
		System.out.println("Max Load: " + maxLoad);
		System.out.println("Has Surge Protection: " + hasSurgeProtection);
		System.out.println("Year Manufactured: " + yearManufactured);
		System.out.println("Safety Rating: " + safetyRating);
		System.out.println("Warranty Years: " + warrantyYears);
		System.out.println("Indicator LEDs: " + indicatorLeds);
		System.out.println("Energy Saver Mode: " + energySaverMode);
		System.out.println("Self-Power Consumption: " + powerConsumption);
		System.out.println("Color: " + color);
		System.out.println("Child-Lock Enabled: " + isChildLockEnabled);
	
	}
}