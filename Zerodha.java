class Zerodha {

    static String email;
    static String userName;
    static String panNumber;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mail, String uname, String pan, String pwd, String cpwd) {
        boolean accountCreated = false;

        boolean emailValid = false;
        boolean userNameValid = false;
        boolean panValid = false;
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

        if (pan != null) {
            panNumber = pan;
            panValid = true;
        } else {
            System.out.println("Invalid PAN number");
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

        if (emailValid && userNameValid && panValid && passwordValid && confirmPasswordValid) {
            System.out.println("All fields are valid. Zerodha account created.");
            accountCreated = true;
        }

        return accountCreated;
    }

    public static void readAccount(){
	
        System.out.println("Zerodha Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("PAN Number: " + panNumber);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}

