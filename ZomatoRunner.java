class ZomatoRunner{

	public static void main(String zomato[]){
	
		System.out.println("Main Started");
		String foodName = "Paratha";
		double price = Zomato.takeOrder(foodName);
		System.out.println("The total cost of "+ foodName+ " is "+price);
		
		System.out.println("Main Ended");
	
	}

}