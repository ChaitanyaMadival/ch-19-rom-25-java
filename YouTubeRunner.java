class YouTubeRunner {

    public static void main(String youtube[]) {
        System.out.println("Main Started");

        boolean accountCreated = YouTube.createAccount("cnm@youtube.com","Chaitanya","Education","cnm@123","cnm@123");

        System.out.println("Is Account Created: " +accountCreated);

        if (accountCreated) {
            YouTube.readAccount();
        }

        System.out.println("Main Ended");
    }
}
