class Signal{

	static String location;
    static String currentColor;
    static int redDuration;       
    static int greenDuration;     
    static int yellowDuration;    
    static boolean isWorking;
	
	public static String getLocation(){
		location = "Rajajinagar signal";
		return location;
	}
	
	public static String getCurrentColor() {
        currentColor = "Green";
        return currentColor;
    }

    public static int getRedDuration() {
        redDuration = 60;
        return redDuration;
    }

    public static int getGreenDuration() {
        greenDuration = 40;
        return greenDuration;
    }

    public static int getYellowDuration() {
        yellowDuration = 7;
        return yellowDuration;
    }

    public static boolean getIsWorking() {
        isWorking = true;
        return isWorking;
    }
}