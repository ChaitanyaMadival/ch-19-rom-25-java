class Ola{

    static String mobileNumber;
    static String userName;
    static String city;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mobile, String uname, String place, String pwd, String cpwd) {
        boolean accountCreated = false;
        
		boolean isValidated = OlaValidater.validateOlaUser(mobile, uname,place,pwd,cpwd); 
			
			if(isValidated == true)
				accountCreated = true;
			else
				System.out.println("User is not Validated");


        return accountCreated;
    }

    public static void readAccount(){
		
		 mobileNumber = OlaValidater.mobileNumber;
		 userName = OlaValidater.userName;
		 city = OlaValidater.city;
		 password = OlaValidater.password;
		 confirmPassword = OlaValidater.confirmPassword;
	
        System.out.println("Ola Mobile Number: " + mobileNumber);
        System.out.println("Username: " + userName);
        System.out.println("City: " + city);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}
