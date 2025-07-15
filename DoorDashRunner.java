class DoorDashRunner{

	public static void main(String doorDash[]){
	
		System.out.println("Main Started");
		String foodName = "Pistachio";
		double price = DoorDash.takeOrder(foodName);
		System.out.println("The total cost of "+ foodName+ " is "+price);
		
		int priceWithQuantity = 3;
		price = DoorDash.takeOrder(foodName, priceWithQuantity);
		System.out.println("The price of "+ foodName+ " with Quantity "+priceWithQuantity+" is "+price);
		
		System.out.println("Main Ended");
	
	}

}