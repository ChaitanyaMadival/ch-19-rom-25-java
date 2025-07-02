class PlayStore { 
	/*
	static String spotify = "Spotify";
	static String google = "Google Chrome";
	static String whatsApp = "WhatsApp";
	static String amazon = "Amazon";
	static String calculator = "Calculator";
	static String camera = "Camera";
	static String gmail = "Gmail";
	static String gpay = "GPay";
	static String snapchat = "Snapchat";
	static String telegram = "Telegram";
	
	static String appNames[] = {spotify, google, whatsApp, amazon, calculator, camera, gmail, gpay, snapchat, telegram};
	*/
	public static void main(String store[]){
	
	System.out.println("Main Started");
	//	System.out.println(appNames[0]+ " "+appNames[1]+ " "+appNames[2]+ " "+appNames[3]+ " "+appNames[4]+ " "+
	//		appNames[5]+ " "+appNames[6]+ " "+appNames[7]+ " "+appNames[8]+ " "+appNames[9]);
		
		 String spotify = "Spotify";
		 String google = "Google Chrome";
		 String whatsApp = "WhatsApp";
		 String amazon = "Amazon";
		 String calculator = "Calculator";
		 String camera = "Camera";
		 String gmail = "Gmail";
		 String gpay = "GPay";
		 String snapchat = "Snapchat";
		 String telegram = "Telegram";
		
		 String appNames[] = {spotify, google, whatsApp, amazon, calculator, camera, gmail, gpay, snapchat, telegram};
	
		for(String appName:appNames){
			System.out.println(appName);
		}
	System.out.println("Main Ended");
	}
}