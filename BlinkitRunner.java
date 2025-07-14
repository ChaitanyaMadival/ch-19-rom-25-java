class BlinkitRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        boolean accountCreated = Blinkit.createAccount("cnm@blinkit.com","Chaitanya","Sirsi","blink@123","blink@123");

        System.out.println("Is Account Created: " + accountCreated);

        if (accountCreated) {
            Blinkit.readAccount();
        }

        System.out.println("Main Ended");
    }
}
