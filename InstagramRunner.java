class InstagramRunner{

	public static void main(String insta[]){
		
		String emailId = "chaitanya@gmail.com";
		String userName = "Chaitanya_madival";
		long contactNumber = 7411348257L;
		String password = "cnm@157";
		
		Instagram.logIn(emailId, userName, password);
		//Instagram.logIn(userName, password);
		Instagram.logIn(contactNumber, password);
	
	}

}