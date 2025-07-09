class AirConditioner{
	
	static int maxTemprature = 28; 
	static int currentTemprature = 24;
	static boolean isConnected;
	
	public static void onOrOff(){
		System.out.println("On or Off method started");
	
		if(isConnected == false){
			isConnected = true;
			System.out.println("The AC is turned On");
		}else{
			isConnected = false;
			System.out.println("The AC is turned Off");
		}
		System.out.println("On or Off method ended");
	}
	
	//increaseTemprature
	public static void increaseTemprature(){
		System.out.println("Increase temprature started");
		if(isConnected == true){
			
			if(currentTemprature < maxTemprature){
				currentTemprature = currentTemprature + 1;
				System.out.println("Current Temprature is: " +currentTemprature + " degree");
			}else{
				System.out.println("Maximum temprature reached");
			}
		}else{
			System.out.println("Turn on AC");
		}
		System.out.println("Increase temprature ended");
	}
	
	//decreaseTemprature
	public static void decreaseTemprature(){
		System.out.println("Decrease temprature started");
		if(isConnected == true){
			
			if(currentTemprature > 0){
				currentTemprature = currentTemprature - 1;
				System.out.println("Current Temprature is: "+currentTemprature + " degree");
			}else{
				System.out.println("Minimum temprature reached");
			}
		}else{
			System.out.println("Turn on AC");
		}
		System.out.println("Decrease temprature ended");
	}
}