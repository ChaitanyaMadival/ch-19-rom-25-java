class Hotstar {

    static String email;
    static String userName;
    static String subscriptionType;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mail, String uname, String subType, String pwd, String cpwd) {
        boolean accountCreated = false;

        boolean isValidated = HotstarValidater.validateHotstarUser(mail, uname,subType,pwd,cpwd); 
			
			if(isValidated == true)
				accountCreated = true;
			else
				System.out.println("User is not Validated");

        return accountCreated;
    }

    public static void readAccount() {
		
		 email = HotstarValidater.email;
		 userName = HotstarValidater.userName;
		 subscriptionType = HotstarValidater.subscriptionType;
		 password = HotstarValidater.password;
		 confirmPassword = HotstarValidater.confirmPassword;
		
        System.out.println("Hotstar Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Subscription Type: " + subscriptionType);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}
