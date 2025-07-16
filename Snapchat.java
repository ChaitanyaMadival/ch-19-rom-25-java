class Snapchat{
	
	public static boolean logIn(String email, String password){
		
		boolean isLogedIn = true;
		
		System.out.println("User of email: "+ email +" is loged in with the password: "+password +" succesfully");
		return isLogedIn;
	
	}
	
	public static boolean logIn(long phoneNumber, String password){
		
		boolean  isLogedIn = true;
		
		System.out.println("User of phone number "+phoneNumber+ " is loged in with the password: "+password+" successfully");
		
		return isLogedIn;
	}
}