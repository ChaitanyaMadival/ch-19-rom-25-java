class AmazonRunner {

    public static void main(String[] amazon) {
        System.out.println("Main Started");

        boolean accountCreated = Amazon.createAccount("joy77@amazon.com","Joy","Bhashyam Circle","joyamz@789","joyamz@789");

        System.out.println("Is Account Created: " +accountCreated);

        if (accountCreated) {
            Amazon.readAccount();
        }

        System.out.println("Main Ended");
    }
}
