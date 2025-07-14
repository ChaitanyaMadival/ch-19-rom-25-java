class Radio{
	
	static String color;
	static double weight;
	static int frequencyRange; //hz
	static double price;
	static String brand;
	
	public static String getColor(){
		color = "Black";
		return color;
	}
	
	public static double getWeight(){
		weight = 0.43;
		return weight;
	}
	
	public static int getFrequency(){
		frequencyRange = 4;
		return frequencyRange;
	}
	
	public static double getPrice(){
		price = 120.50;
		return price;
	}
	
	public static String getBrand(){
		brand = "Phillips";
		return brand;
	}
}