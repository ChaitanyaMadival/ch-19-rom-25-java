class TelegramRunner {

    public static void main(String telegram[]) {
        System.out.println("Main Started");

        boolean accountCreated = Telegram.createAccount("9876543210","chaitanya","India","tel@123","tel@123");

        System.out.println("Is Account Created: " + accountCreated);

        if (accountCreated) {
            Telegram.readAccount();
        }

        System.out.println("Main Ended");
    }
}
