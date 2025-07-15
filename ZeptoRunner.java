class ZeptoRunner{

	public static void main(String zepto[]){
	
		System.out.println("Main Started");
		String foodName = "Sharjah";
		
		double price = Zepto.takeOrder(foodName);
		System.out.println("The total cost of "+ foodName+ " is "+price);
		
		int priceWithQuantity = 2;
		 price = Zepto.takeOrder(foodName, priceWithQuantity);
		System.out.println("The price of "+ foodName+ " with Quantity "+priceWithQuantity+" is "+price);
		
		System.out.println("Main Ended");
	
	}

}