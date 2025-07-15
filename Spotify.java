class Spotify {

    static String email;
    static String userName;
    static String country;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mail, String uname, String location, String pwd, String cpwd){
	
        boolean accountCreated = false;

        boolean isValidated = SpotifyValidater.validateSpotifyUser(mail, uname,location,pwd,cpwd); 
			
			if(isValidated == true)
				accountCreated = true;
			else
				System.out.println("User is not Validated");

        return accountCreated;
    }

    public static void readAccount(){
		
		email = SpotifyValidater.email;
		userName = SpotifyValidater.userName;
		country = SpotifyValidater.country;
		password = SpotifyValidater.password;
		confirmPassword = SpotifyValidater.confirmPassword;
	
        System.out.println("Spotify Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Country: " + country);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}

