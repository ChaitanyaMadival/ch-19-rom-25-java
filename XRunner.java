class XRunner{

	public static void main(String x[]){
	
		String email = "chaitanya@gmail.com";
		String userName = "Chaitanya";
		long contactNumber = 7411348257L;
		String password = "x@123";
		
		X.logIn(email, userName, password);
		X.logIn(contactNumber, password);
	
	}
}