class Bar { 

	/*
	static String beer = "Beer";
	static String wine = "Wine";
	static String vodka = "Vodka";
	static String gin = "Gin";
	static String rum = "Rum";
	static String wiskey = "Whiskey";
	static String tequila = "Tequila";
	static String brandy = "Brandy";
	static String liquer = "Liquer";
	static String cider = "Cider";
	static String sparklingWine = "Sparkling Wine";
	static String sake = "Sake";
	
	static String alcoholNames[] = {beer, wine, vodka, gin, rum, wiskey, tequila, brandy, liquer, cider, sparklingWine, sake};
	*/
	public static void main(String drinks[]) {
	
		System.out.println("Main Started");
	//	System.out.println("The total length of the Alcohol Name "+alcoholNames.length);
	//	System.out.println(alcoholNames[0]+ " "+alcoholNames[1]+ " "+alcoholNames[2]+ " "+alcoholNames[3]+ " "+alcoholNames[4]+ " "+alcoholNames[5]
	//		+ " "+alcoholNames[6]+ " "+alcoholNames[7]+ " "+alcoholNames[7]+ " "+alcoholNames[8]+ " "+alcoholNames[9]+ " "+alcoholNames[10]+ " "+alcoholNames[11]);
		 String beer = "Beer";
		 String wine = "Wine";
		 String vodka = "Vodka";
		 String gin = "Gin";
		 String rum = "Rum";
		 String wiskey = "Whiskey";
		 String tequila = "Tequila";
		 String brandy = "Brandy";
		 String liquer = "Liquer";
		 String cider = "Cider";
		 String sparklingWine = "Sparkling Wine";
		 String sake = "Sake";
		
		 String alcoholNames[] = {beer, wine, vodka, gin, rum, wiskey, tequila, brandy, liquer, cider, sparklingWine, sake};
	
		for(String alcoholName: alcoholNames){
			System.out.println(alcoholName);
		}
		System.out.println("Main Ended");
	}

}