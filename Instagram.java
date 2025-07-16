class Instagram{

	public static boolean logIn(String email, String userName, String password){
		
		boolean isLogedIn = true;
		
		System.out.println("User of Email Id: "+email+ " with Password: "+ password +"Loged in Successfully");
		System.out.println("User : "+ userName +" with password: "+ password +" Loged In Successfully");
		
		return isLogedIn;
	}
	
	public static boolean logIn(long phoneNumber, String password){
		boolean isLogedIn = true;
		
		System.out.println("User of Phone Number: "+phoneNumber+" with Password: "+password+" Loged in succesfully");
		return isLogedIn;
	}

}