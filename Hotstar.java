class Hotstar {

    static String email;
    static String userName;
    static String subscriptionType;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mail, String uname, String subType, String pwd, String cpwd) {
        boolean accountCreated = false;

        boolean emailValid = false;
        boolean userNameValid = false;
        boolean subscriptionTypeValid = false;
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

        if (subType != null) {
            subscriptionType = subType;
            subscriptionTypeValid = true;
        } else {
            System.out.println("Subscription type required");
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

        if (emailValid && userNameValid && subscriptionTypeValid && passwordValid && confirmPasswordValid) {
            System.out.println("All fields are valid. Hotstar account created.");
            accountCreated = true;
        }

        return accountCreated;
    }

    public static void readAccount() {
        System.out.println("Hotstar Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Subscription Type: " + subscriptionType);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}
