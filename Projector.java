class Projector{

	static int maxVolume = 10;
	static int currentVolume;
	static boolean isConnected;
	
	public static void onOrOff(){
		System.out.println("On or Off method started");
	
		if(isConnected == false){
			isConnected = true;
			System.out.println("The Projector is turned On");
		}else{
			isConnected = false;
			System.out.println("The Projector is turned Off");
		}
		System.out.println("On or Off method ended");
	}
	
	//increaseVolume
	public static void increaseVolume(){
		System.out.println("increase volume started");
		
		if(isConnected == true){
		
			if(currentVolume < maxVolume){
				currentVolume = currentVolume + 1;
				System.out.println("Current Volume is: "+currentVolume);
			}else{
				System.out.println("Maximum Volume reached");
			}
		}else{
			System.out.println("Turn on Projector");
		}
		
		System.out.println("increase volume ended");
	}
	
	//decreaseVolume
	public static void decreaseVolume(){
		System.out.println("Decrease Volume started");
		if(isConnected == true){
			
			if(currentVolume > 0){
				currentVolume = currentVolume - 1;
				System.out.println("Current volume is: "+currentVolume);
			}else{
				System.out.println("Minimum volume reached");
			}
		}else{
			System.out.println("Turn on Projector");
		}
		System.out.println("decrease speed ended");
	}
}