class SpotifyRunner {

    public static void main(String spotify[]) {
        System.out.println("Main Started");

        boolean accountCreated = Spotify.createAccount("happy@spotify.com","Chaitanya","India","spotify@123","spotify@123");

        System.out.println("Is Account Created: " + accountCreated);

        if (accountCreated) {
            Spotify.readAccount();
        }

        System.out.println("Main Ended");
    }
}
