class Snapchat {

    static String email;
    static String userName;
    static String mobileNumber;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mail, String uname, String mobile, String pwd, String cpwd) {
        boolean accountCreated = false;

        boolean emailValid = false;
        boolean userNameValid = false;
        boolean mobileValid = false;
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

        if (mobile != null) {
            mobileNumber = mobile;
            mobileValid = true;
        } else {
            System.out.println("Invalid mobile number");
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

        if (emailValid && userNameValid && mobileValid && passwordValid && confirmPasswordValid) {
            System.out.println("All fields are valid. Snapchat account created.");
            accountCreated = true;
        }

        return accountCreated;
    }

    public static void readAccount() {
        System.out.println("Snapchat Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}
