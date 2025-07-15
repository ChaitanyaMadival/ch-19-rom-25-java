class SnapchatRunner {

    public static void main(String snap[]) {
        System.out.println("Main Started");

        boolean accountCreated = Snapchat.createAccount("chaitu@gmail.com","chaitanya_madival","9876543210","snap@123","snap@123");

        System.out.println("Is Account Created: " + accountCreated);

        if (accountCreated) {
            Snapchat.readAccount();
        }

        System.out.println("Main Ended");
    }
}
