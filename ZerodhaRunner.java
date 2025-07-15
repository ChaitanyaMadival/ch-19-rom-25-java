class ZerodhaRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        boolean accountCreated = Zerodha.createAccount("trader@zerodha.com","investor99","ZER27CC","stock@123","stock@123");

        System.out.println("Is Account Created: " + accountCreated);

        if (accountCreated) {
            Zerodha.readAccount();
        }

        System.out.println("Main Ended");
    }
}
