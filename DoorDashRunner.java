class DoorDashRunner{

	public static void main(String doorDash[]){
	
		System.out.println("Main Started");
		String foodName = "Burasahh";
		double price = DoorDash.takeOrder(foodName);
		System.out.println("The total cost of "+ foodName+ " is "+price);
		
		System.out.println("Main Ended");
	
	}

}