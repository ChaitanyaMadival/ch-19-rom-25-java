class Hotel {
	
	
	static String vegItems[] = {"Masal Dosa", "Idli","Vadas", "Pongal", "Gobi", "Jeera Rice", "Veg Biryani", 
							 "Parota", "Paneer Biryani", "Palak Palav" };
	static String nonVegItems[] = {"Chicken Biryani", "Chicken Kabaab", "Chilli Chicken", "Butter Chicken", 
								"Chicken Lolipop", "Mutton Curry", "Omlet", "Egg Rice", "Fish Fry", "Prawns fry",
								"Mutton Biryani", "Bamboo Biryani", "Boiled Egg", "Egg Bonda", "Chicken Fried Rice"};
	
	public static void main(String hotel[]){
	
		String menus = "Veg And Non-Veg";
		
		/*System.out.println(menus);
		System.out.println("The total Length of the menue is "+vegItems.length + ", "+ nonVegItems.length);
		System.out.println(vegItems[0] + " " +vegItems[1] + " "+ vegItems[2]+ " "+ vegItems[3]+ " "+vegItems[4]+ " "+
			vegItems[5]+ " "+ vegItems[6]+ " "+ vegItems[7]+ " "+vegItems[8]+ " "+vegItems[9]);
		System.out.println(nonVegItems[0]+ " "+nonVegItems[1]+ " "+nonVegItems[2]+ " "+nonVegItems[3]+ " "+nonVegItems[4]+ " "+
			nonVegItems[5]+ " "+nonVegItems[6]+ " "+nonVegItems[7]+ " "+nonVegItems[8]+ " "+nonVegItems[9]+ " "+nonVegItems[10]+ " "+nonVegItems[11]+ " "+nonVegItems[12]+ " "+nonVegItems[13]+ " "+nonVegItems[14]);			   
		*/
		for(String vegItem: vegItems){
			System.out.println(vegItem);
		}
		System.out.println("----------");
		for(String nonVegItem: nonVegItems){
			System.out.println(nonVegItem);
		}
	}

}