class Desktop {
	
	static String brand;
    static String model;
    static String processor;
    static int ramSizeGb;
    static int storageSizeGb;
    static String storageType;
    static String operatingSystem;
    static boolean hasGraphicsCard;
    static String graphicsCardModel;
    static boolean hasWifi;
    static boolean hasBluetooth;
    static String color;
    static double weight; 
    static boolean hasOpticalDrive;
    static int usbPorts;
    static boolean isAllInOne;
    static double screenSize; 
    static boolean hasHdmi;
    static boolean hasEthernetPort;
    static int warrantyYears; 
	
	public static void main(String desktop[]) {
	
		System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSizeGb + " GB");
        System.out.println("Storage Size: " + storageSizeGb + " GB");
        System.out.println("Storage Type: " + storageType);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Has Graphics Card: " + hasGraphicsCard);
        System.out.println("Graphics Card Model: " + graphicsCardModel);
        System.out.println("WiFi Available: " + hasWifi);
        System.out.println("Bluetooth Available: " + hasBluetooth);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Optical Drive: " + hasOpticalDrive);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("All-in-One: " + isAllInOne);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("HDMI Support: " + hasHdmi);
        System.out.println("Ethernet Port: " + hasEthernetPort);
        System.out.println("Warranty Period: " + warrantyYears + " years");
		
		System.out.println("-------           -------");
		
		brand = "Dell";
		model = "OptiPlex 7090";
		processor = "Intel Core i7";
		ramSizeGb = 16;
		storageSizeGb = 512;
		storageType = "SSD";
		operatingSystem = "Windows 11";
		hasGraphicsCard = true;
		graphicsCardModel = "NVIDIA GTX 1660";
		hasWifi = true;
		hasBluetooth = true;
		color = "Black";
		weight = 6.5; 
		hasOpticalDrive = false;
		usbPorts = 6;
		isAllInOne = false;
		screenSize = 24.0; 
		hasHdmi = true;
		hasEthernetPort = true;
		warrantyYears = 3; 
		
		System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSizeGb + " GB");
        System.out.println("Storage Size: " + storageSizeGb + " GB");
        System.out.println("Storage Type: " + storageType);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Has Graphics Card: " + hasGraphicsCard);
        System.out.println("Graphics Card Model: " + graphicsCardModel);
        System.out.println("WiFi Available: " + hasWifi);
        System.out.println("Bluetooth Available: " + hasBluetooth);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Optical Drive: " + hasOpticalDrive);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("All-in-One: " + isAllInOne);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("HDMI Support: " + hasHdmi);
        System.out.println("Ethernet Port: " + hasEthernetPort);
        System.out.println("Warranty Period: " + warrantyYears + " years");
		
	}
}