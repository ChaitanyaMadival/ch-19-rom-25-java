class Zerodha {

    static String email;
    static String userName;
    static String panNumber;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mail, String uname, String pan, String pwd, String cpwd) {
        boolean accountCreated = false;
		
		boolean isValidated = ZerodhaValidater.validateZerodhaUser(mail, uname,pan,pwd,cpwd); 
			
			if(isValidated == true)
				accountCreated = true;
			else
				System.out.println("User is not Validated");

        return accountCreated;
    }

    public static void readAccount(){
	
		 email = ZerodhaValidater.email;
		 userName = ZerodhaValidater.userName;
		 panNumber = ZerodhaValidater.panNumber;
		 password = ZerodhaValidater.password;
		 confirmPassword = ZerodhaValidater.confirmPassword;
	
        System.out.println("Zerodha Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("PAN Number: " + panNumber);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}

