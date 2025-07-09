class WashingMachine{

	static int maxSpeed = 5;
	static int currentSpeed;
	static boolean isConnected;
	
	public static void onOrOff(){
		System.out.println("On or Off method started");
	
		if(isConnected == false){
			isConnected = true;
			System.out.println("The Washing Machine is turned On");
		}else{
			isConnected = false;
			System.out.println("The Washing Machine is turned Off");
		}
		System.out.println("On or Off method ended");
	}
	
	//increaseSpeed
	public static void increaseSpeed(){
		System.out.println("increase speed started");
		
		if(isConnected == true){
		
			if(currentSpeed < maxSpeed){
				currentSpeed = currentSpeed + 1;
				System.out.println("Current Speed is: "+currentSpeed);
			}else{
				System.out.println("Maximum Speed reached");
			}
		}else{
			System.out.println("Turn on Washing Machine");
		}
		
		System.out.println("increase speed ended");
	}
	
	//decreaseSpeed
	public static void decreaseSpeed(){
		System.out.println("Decrease speed started");
		if(isConnected == true){
			
			if(currentSpeed > 0){
				currentSpeed = currentSpeed - 1;
				System.out.println("Current speed is: "+currentSpeed);
			}else{
				System.out.println("Minimum speed reached");
			}
		}else{
			System.out.println("Turn on Washing Machine");
		}
		System.out.println("decrease speed ended");
	}
}