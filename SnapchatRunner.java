class SnapchatRunner{

	public static void main(String snap[]){
		
		String email = "chaitu@gmail.com";
		long phoneNumber = 7411348257L;
		String password ="chaitanya@552";
		
		Snapchat.logIn(email, password);
		Snapchat.logIn(phoneNumber, password);
	
	}

}