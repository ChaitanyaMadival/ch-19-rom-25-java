class PhonePeRunner {

    public static void main(String phonepay[]) {
        System.out.println("Main Started");

        boolean accountCreated = PhonePe.createAccount("9876543210","Chaitanya","State Bank of India","phonepe@123", "phonepe@123");

        System.out.println("Is Account Created: " + accountCreated);

        if (accountCreated) {
            PhonePe.readAccount();
        }

        System.out.println("Main Ended");
    }
}
