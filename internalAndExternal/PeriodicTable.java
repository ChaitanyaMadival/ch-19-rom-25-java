class PeriodicTable {
	/*
	static String carbon = "Carbon";
	static String hydrogen = "Hydrogen";
	static String nitrogen = "Nitrogen";
	static String boron = "Boron";
	static String oxygen = "Oxygen";
	static String lithium = "Lithium";
	static String uranium = "Uranium";
	static String calcium = "Calcium";
	static String zinc = "Zinc";
	static String gold = "Gold";
	static String helium = "Helium";
	static String aluminium = "Aluminium";
	
	static String elements[] = {carbon, hydrogen, nitrogen, boron, oxygen, lithium, uranium, calcium, zinc, gold, helium, aluminium};
	*/
	public static void main(String table[]) {
	
	System.out.println("Main Started");
		/*System.out.println("Length "+elements.length);
		System.out.println(elements[0]+ " "+elements[1]+ " "+elements[2]+ " "+elements[3]+ " "+elements[4]+ " "+elements[5]+ 
			" "+elements[6]+ " "+elements[7]+ " "+elements[8]+ " "+elements[9]+ " "+elements[10]+ " "+elements[11]);
	*/
	
		 String carbon = "Carbon";
		 String hydrogen = "Hydrogen";
		 String nitrogen = "Nitrogen";
		 String boron = "Boron";
		 String oxygen = "Oxygen";
		 String lithium = "Lithium";
		 String uranium = "Uranium";
		 String calcium = "Calcium";
		 String zinc = "Zinc";
		 String gold = "Gold";
		 String helium = "Helium";
		 String aluminium = "Aluminium";
		
		 String elements[] = {carbon, hydrogen, nitrogen, boron, oxygen, lithium, uranium, calcium, zinc, gold, helium, aluminium};
	
		for(String element:elements){
			System.out.println(element);
		}
	System.out.println("Main Ended");
	}
}