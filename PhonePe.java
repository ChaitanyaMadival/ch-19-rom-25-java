class PhonePe {

    static String mobileNumber;
    static String userName;
    static String bankName;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mobile, String uname, String bank, String pwd, String cpwd){
        
		boolean accountCreated = false;

        boolean isValidated = PhonePeValidater.validatePhonePeUser(mobile, uname,bank,pwd,cpwd); 
			
			if(isValidated == true)
				accountCreated = true;
			else
				System.out.println("User is not Validated");

        return accountCreated;
    }

    public static void readAccount(){
		
		mobileNumber = PhonePeValidater.mobileNumber;
		userName = PhonePeValidater.userName;
		bankName = PhonePeValidater.bankName;
		password = PhonePeValidater.password;
		confirmPassword = PhonePeValidater.confirmPassword;
	
        System.out.println("PhonePe Mobile Number: " + mobileNumber);
        System.out.println("Username: " + userName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}
