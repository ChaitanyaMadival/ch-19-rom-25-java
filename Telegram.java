class Telegram{

    static String mobileNumber;
    static String userName;
    static String country;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mobile, String uname, String countryName, String pwd, String cpwd) {
        boolean accountCreated = false;
		
		boolean isValidated = TelegramValidater.validateTelegramUser(mobile, uname,countryName,pwd,cpwd); 
			
			if(isValidated == true)
				accountCreated = true;
			else
				System.out.println("User is not Validated");

       
        return accountCreated;
    }

    public static void readAccount(){
		
		 mobileNumber = TelegramValidater.mobileNumber;
		 userName = TelegramValidater.userName;
		 country = TelegramValidater.country;
		 password = TelegramValidater.password;
		 confirmPassword = TelegramValidater.confirmPassword;
		 
        System.out.println("Telegram Mobile Number: " + mobileNumber);
        System.out.println("Username: " + userName);
        System.out.println("Country: " + country);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}
