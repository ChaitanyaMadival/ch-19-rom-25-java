class SwiggyRunner{

	public static void main(String swiggy[]){
	
		System.out.println("Main Started");
		String foodName = "Lassi";
		double price = Swiggy.takeOrder(foodName);
		System.out.println("The total cost of "+ foodName+ " is "+price);
		
		System.out.println("Main Ended");
	
	}

}