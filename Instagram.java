class Instagram{

    static String email;
    static String userName;
    static String mobileNumber;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mail, String uname, String mobile, String pwd, String cpwd) {
        boolean accountCreated = false;

        boolean isValidated = InstagramValidater.validateInstagramUser(mail, uname,mobile,pwd,cpwd); 
			
			if(isValidated == true)
				accountCreated = true;
			else
				System.out.println("User is not Validated");


        return accountCreated;
    }

    public static void readAccount(){
		
		 email = InstagramValidater.email;
		 userName = InstagramValidater.userName;
		 mobileNumber = InstagramValidater.mobileNumber;
		 password = InstagramValidater.password;
		 confirmPassword = InstagramValidater.confirmPassword;
	
        System.out.println("Instagram Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}

