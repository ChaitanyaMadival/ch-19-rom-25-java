class UberEatsRunner{

	public static void main(String uberEats[]){
	
		System.out.println("Main Started");
		String foodName = "Donuts";
		double price = UberEats.takeOrder(foodName);
		System.out.println("The total cost of "+ foodName+ " is "+price);
		
		System.out.println("Main Ended");
	
	}

}