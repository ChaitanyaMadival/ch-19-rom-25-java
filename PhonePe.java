class PhonePe {

    static String mobileNumber;
    static String userName;
    static String bankName;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mobile, String uname, String bank, String pwd, String cpwd){
        
		boolean accountCreated = false;

        boolean mobileValid = false;
        boolean userNameValid = false;
        boolean bankNameValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;

        if (mobile != null && mobile.length() == 10) {
            mobileNumber = mobile;
            mobileValid = true;
        } else {
            System.out.println("Invalid mobile number");
        }

        if (uname != null) {
            userName = uname;
            userNameValid = true;
        } else {
            System.out.println("Username required");
        }

        if (bank != null) {
            bankName = bank;
            bankNameValid = true;
        } else {
            System.out.println("Bank name required");
        }

        if (pwd != null) {
            password = pwd;
            passwordValid = true;
        } else {
            System.out.println("Weak password");
        }

        if (cpwd != null && pwd != null && pwd == cpwd) {
            confirmPassword = cpwd;
            confirmPasswordValid = true;
        } else {
            System.out.println("Password mismatch");
        }

        if (mobileValid && userNameValid && bankNameValid && passwordValid && confirmPasswordValid) {
            System.out.println("All fields are valid. PhonePe account created.");
            accountCreated = true;
        }

        return accountCreated;
    }

    public static void readAccount(){
	
        System.out.println("PhonePe Mobile Number: " + mobileNumber);
        System.out.println("Username: " + userName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}
