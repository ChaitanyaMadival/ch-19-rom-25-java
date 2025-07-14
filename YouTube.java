class YouTube {

    static String email;
    static String channelName;
    static String category;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mail, String cname, String cat, String pwd, String cpwd) {
        boolean accountCreated = false;

        boolean emailValid = false;
        boolean channelNameValid = false;
        boolean categoryValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;

        if (mail != null) {
            email = mail;
            emailValid = true;
        } else {
            System.out.println("Invalid email");
        }

        if (cname != null) {
            channelName = cname;
            channelNameValid = true;
        } else {
            System.out.println("Channel name required");
        }

        if (cat != null) {
            category = cat;
            categoryValid = true;
        } else {
            System.out.println("Category required");
        }

        if (pwd != null) {
            password = pwd;
            passwordValid = true;
        } else {
            System.out.println("Weak password");
        }

        if (cpwd != null && pwd != null) {
            confirmPassword = cpwd;
            confirmPasswordValid = true;
        } else {
            System.out.println("Password mismatch");
        }

        if (emailValid && channelNameValid && categoryValid && passwordValid && confirmPasswordValid) {
            System.out.println("All fields are valid. YouTube account created.");
            accountCreated = true;
        }

        return accountCreated;
    }

    public static void readAccount(){
	
        System.out.println("YouTube Email: " + email);
        System.out.println("Channel Name: " + channelName);
        System.out.println("Category: " + category);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}
