class GoogleWebsiteRunner {

    public static void main(String google[]) {
        System.out.println("Main Started");

        boolean isRegistered = GoogleWebsite.registerWebsite("Google","https://www.google.com","Sundar Pichai","Mountain View, CA",1998);

        System.out.println("Is Website Registered: " +isRegistered);

        if (isRegistered) {
            GoogleWebsite.getWebsiteInfo();
        }

        System.out.println("Main Ended");
    }
}
