class Projector {
	
	static String brand;
    static String model;
    static int resolutionWidth;
    static int resolutionHeight;
    static boolean isSmartProjector;
    static double brightness; 
    static double contrastRatio;
    static String projectionTechnology;
    static int hdmiPorts;
    static boolean hasBluetooth;
    static boolean hasWifi;
    static String color;
    static double weight; 
    static int lampLife; 
    static boolean keystoneCorrection;
    static String supportedFormats;
    static int maxScreenSize; 
    static boolean hasRemoteControl;
    static int powerConsumption; 
    static int warrantyPeriod; 
	
	public static void main(String projector[]) {
	
		System.out.println("Brand: " + brand);
        System.out.println("Model: " +model);
        System.out.println("Resolution: " + resolutionWidth + "x" + resolutionHeight);
        System.out.println("Smart Projector: " + isSmartProjector);
        System.out.println("Brightness: " + brightness + " lumens");
        System.out.println("Contrast Ratio: " + contrastRatio + ":1");
        System.out.println("Projection Technology: " + projectionTechnology);
        System.out.println("HDMI Ports: " + hdmiPorts);
        System.out.println("Bluetooth: " + hasBluetooth);
        System.out.println("Wi-Fi: " + hasWifi);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Lamp Life: " + lampLife + " hours");
        System.out.println("Keystone Correction: " + keystoneCorrection);
        System.out.println("Supported Formats: " + supportedFormats);
        System.out.println("Max Screen Size: " + maxScreenSize + " inches");
        System.out.println("Remote Control Included: " + hasRemoteControl);
        System.out.println("Power Consumption: " + powerConsumption + " W");
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
		
		System.out.println("-------           -------");
		
		brand = "Epson";
		model = "X1000";
		resolutionWidth = 1920;
		resolutionHeight = 1080;
		isSmartProjector = true;
		brightness = 3500.0; 
		contrastRatio = 15000.0;
		projectionTechnology = "LCD";
		hdmiPorts = 2;
		hasBluetooth = true;
		hasWifi = true;
		color = "Black";
		weight = 2.8; 
		lampLife = 10000; 
		keystoneCorrection = true;
		supportedFormats = "MP4, AVI, MKV";
		maxScreenSize = 300; 
		hasRemoteControl = true;
		powerConsumption = 250; 
		warrantyPeriod = 2; 
		
		System.out.println("Brand: " + brand);
        System.out.println("Model: " +model);
        System.out.println("Resolution: " + resolutionWidth + "x" + resolutionHeight);
        System.out.println("Smart Projector: " + isSmartProjector);
        System.out.println("Brightness: " + brightness + " lumens");
        System.out.println("Contrast Ratio: " + contrastRatio + ":1");
        System.out.println("Projection Technology: " + projectionTechnology);
        System.out.println("HDMI Ports: " + hdmiPorts);
        System.out.println("Bluetooth: " + hasBluetooth);
        System.out.println("Wi-Fi: " + hasWifi);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Lamp Life: " + lampLife + " hours");
        System.out.println("Keystone Correction: " + keystoneCorrection);
        System.out.println("Supported Formats: " + supportedFormats);
        System.out.println("Max Screen Size: " + maxScreenSize + " inches");
        System.out.println("Remote Control Included: " + hasRemoteControl);
        System.out.println("Power Consumption: " + powerConsumption + " W");
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
	
	}
}