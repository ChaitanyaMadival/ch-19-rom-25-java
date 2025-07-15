class UberEatsRunner{

	public static void main(String uberEats[]){
	
		System.out.println("Main Started");
		String foodName = "Watermelon";
		double price = UberEats.takeOrder(foodName);
		System.out.println("The total cost of "+ foodName+ " is "+price);
		
		int priceWithQuantity = 3;
		price = UberEats.takeOrder(foodName, priceWithQuantity);
		System.out.println("The price of "+foodName+" with the quantity "+priceWithQuantity+" is "+ price);
		
		System.out.println("Main Ended");
	
	}

}