class TelegramValidater{
	
	static String mobileNumber;
    static String userName;
    static String country;
    static String password;
    static String confirmPassword;
	
	public static boolean validateTelegramUser(String mobile, String uname, String countryName, String pwd, String cpwd){
	
		boolean isUserValidated = false;
		
		boolean mobileValid = false;
        boolean userNameValid = false;
        boolean countryValid = false;
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

        if (countryName != null) {
            country = countryName;
            countryValid = true;
        } else {
            System.out.println("Country required");
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

        if (mobileValid && userNameValid && countryValid && passwordValid && confirmPasswordValid) {
            System.out.println("All fields are valid. Telegram account created.");
            isUserValidated = true;
        }
		return isUserValidated;
	}
}