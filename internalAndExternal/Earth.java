class Earth {

	/*
	static String asia = "Asia";
	static String africa = "Africa";
	static String northAmerica = "North America";
	static String southAmerica = "South America";
	static String antartica = "Antartica";
	static String europe = "Europe";
	static String australia = "Australia";
	
	static String continents[] = {asia, africa, northAmerica, southAmerica, antartica, europe, australia};
	*/
	public static void main(String earth[]) {
		
		System.out.println("Main Started");
	//	System.out.println(continents[0]+ " "+continents[1]+ " "+continents[2]+ " "+continents[3]+ " "+continents[4]+ " "+continents[5]+ " "+continents[6]);
		 String asia = "Asia";
		 String africa = "Africa";
		 String northAmerica = "North America";
		 String southAmerica = "South America";
		 String antartica = "Antartica";
		 String europe = "Europe";
		 String australia = "Australia";
		
		 String continents[] = {asia, africa, northAmerica, southAmerica, antartica, europe, australia};

		for(String continent: continents){
			System.out.println(continent);
		}
		System.out.println("Main Ended");
	}

}