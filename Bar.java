class Bar { 
	
	static String alcoholNames[] = {"Beer", "Wine", "Vodka", "Gin", "Rum", "Whiskey", "Tequila", "Brandy", "Liqueur", "Cider", "Sparkling Wine", "Sake"};
	
	public static void main(String drinks[]) {
	
	//	System.out.println("The total length of the Alcohol Name "+alcoholNames.length);
	//	System.out.println(alcoholNames[0]+ " "+alcoholNames[1]+ " "+alcoholNames[2]+ " "+alcoholNames[3]+ " "+alcoholNames[4]+ " "+alcoholNames[5]
	//		+ " "+alcoholNames[6]+ " "+alcoholNames[7]+ " "+alcoholNames[7]+ " "+alcoholNames[8]+ " "+alcoholNames[9]+ " "+alcoholNames[10]+ " "+alcoholNames[11]);
		for(String alcoholName: alcoholNames){
			System.out.println(alcoholName);
		}
	}

}