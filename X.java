class X{

	public static boolean logIn(String email, String userName, String password){
		
		boolean isLogedIn = true;
		
		System.out.println("User of email id: "+email+ " with Password: "+ password +" Loged in successfully");
		System.out.println("User : "+ userName +" with password: "+ password +" Loged in Successfully");
		return isLogedIn;
	
	}
	
	public static boolean logIn(long phoneNumber, String password){
		
		boolean isLogedIn = true;
		
		System.out.println("User of Phone number: "+phoneNumber+" with Password: "+password+" Loged in succesfully");
		
		return isLogedIn;
	
	}
}