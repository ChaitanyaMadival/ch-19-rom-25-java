class Blinkit {

    static String email;
    static String userName;
    static String city;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mail, String uname, String place, String pwd, String cpwd) {
        boolean accountCreated = false;

        boolean isValidated = BlinkitValidater.validateBlinkitUser(mail, uname,place,pwd,cpwd); 
			
			if(isValidated == true)
				accountCreated = true;
			else
				System.out.println("User is not Validated");

        return accountCreated;
    }

    public static void readAccount() {
		
		 email = BlinkitValidater.email;
		 userName = BlinkitValidater.userName;
		 city = BlinkitValidater.city;
		 password = BlinkitValidater.password;
		 confirmPassword = BlinkitValidater.confirmPassword;
		 
        System.out.println("Blinkit Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("City: " + city);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}
