class Hotel{

	public static void getChefDetails(){
		System.out.println("Hotel getChefDetails Started");
		Chef.chefInfo();
		System.out.println("Name of the Chef is: "+Chef.chefName);
		System.out.println("Id of the chef is: "+Chef.chefId);
		System.out.println("Hotel getChefDetails ended");
	}

} 