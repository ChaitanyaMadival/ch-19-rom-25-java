class BlinkitValidater{
	
	static String email;
    static String userName;
    static String city;
    static String password;
    static String confirmPassword;
	
	public static boolean validateBlinkitUser(String mail, String uname, String place, String pwd, String cpwd){
	
		boolean isUserValidated = false;
		
		boolean emailValid = false;
        boolean userNameValid = false;
        boolean cityValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;

        if (mail != null) {
            email = mail;
            emailValid = true;
        } else {
            System.out.println("Invalid email");
        }

        if (uname != null) {
            userName = uname;
            userNameValid = true;
        } else {
            System.out.println("Username required");
        }

        if (place != null) {
            city = place;
            cityValid = true;
        } else {
            System.out.println("City required");
        }

        if (pwd != null) {
            password = pwd;
            passwordValid = true;
        } else {
            System.out.println("Weak password");
        }

        if (cpwd != null && pwd != null && pwd== cpwd) {
            confirmPassword = cpwd;
            confirmPasswordValid = true;
        } else {
            System.out.println("Password mismatch");
        }

        if (emailValid && userNameValid && cityValid && passwordValid && confirmPasswordValid) {
            System.out.println("All fields are valid. Blinkit account created.");
            isUserValidated = true;
        }
		return isUserValidated;
	}
}