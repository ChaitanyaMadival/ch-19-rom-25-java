class GitHubRunner{

	public static void main(String gitHub[]){
		
		String email = "coderCR7@gmail.com";
		long phoneNumber = 7411348257l;
		String password ="chai@github277";
		
		GitHub.logIn(email, password);
		GitHub.logIn(phoneNumber, password);
		
	}

}