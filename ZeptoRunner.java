class ZeptoRunner{

	public static void main(String zepto[]){
	
		System.out.println("Main Started");
		String foodName = "Rasam";
		double price = Zepto.takeOrder(foodName);
		System.out.println("The total cost of "+ foodName+ " is "+price);
		
		System.out.println("Main Ended");
	
	}

}