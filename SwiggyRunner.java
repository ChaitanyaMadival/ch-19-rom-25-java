class SwiggyRunner{

	public static void main(String swiggy[]){
	
		System.out.println("Main Started");
		String foodName = "Pakhala";
		double price = Swiggy.takeOrder(foodName);
		System.out.println("The total cost of "+ foodName+ " is "+price);
		
		int priceWithQuantity = 4;
		price = Swiggy.takeOrder(foodName, priceWithQuantity);
		System.out.println("Tge price of "+foodName+" with quantity " +priceWithQuantity+" is "+price);
		
		
		System.out.println("Main Ended");
	
	}

}