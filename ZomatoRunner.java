class ZomatoRunner{

	public static void main(String zomato[]){
	
		System.out.println("Main Started");
		String foodName = "Papad";
		double price = Zomato.takeOrder(foodName);
		System.out.println("The total cost of "+ foodName+ " is "+price);
		
		int priceWithQuantity = 5;
		price = Zomato.takeOrder(foodName, priceWithQuantity);
		System.out.println("The price of "+ foodName+ " with Quantity "+priceWithQuantity+" is "+price);
		
		System.out.println("Main Ended");
	
	}

}