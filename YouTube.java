class YouTube {

    static String email;
    static String channelName;
    static String category;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String mail, String cname, String cat, String pwd, String cpwd) {
        boolean accountCreated = false;

        boolean isValidated = YouTubeValidater.validateYouTubeUser(mail, cname,cat,pwd,cpwd); 
			
			if(isValidated == true)
				accountCreated = true;
			else
				System.out.println("User is not Validated");

        return accountCreated;
    }

    public static void readAccount(){
		
		 email = YouTubeValidater.email;
		 channelName = YouTubeValidater.channelName;
		 category = YouTubeValidater.category;
		 password = YouTubeValidater.password;
		 confirmPassword = YouTubeValidater.confirmPassword;
	
        System.out.println("YouTube Email: " + email);
        System.out.println("Channel Name: " + channelName);
        System.out.println("Category: " + category);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}
