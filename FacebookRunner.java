class FacebookRunner{
	
	public static void main(String facebook[]){
	
	String userName = "Chaitu";
	String password = "chaitu@77";
	Facebook.logIn(userName, password);
	
	long userPhoneNumber = 7411348257L;
	Facebook.logIn(userPhoneNumber, password);
	
	}
}