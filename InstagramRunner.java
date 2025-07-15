class InstagramRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        boolean accountCreated = Instagram.createAccount("cnm@gmail.com","chaitanya_madival","9876543210","cnm@123","cnm@123");

        System.out.println("Is Account Created: " + accountCreated);

        if (accountCreated) {
            Instagram.readAccount();
        }

        System.out.println("Main Ended");
    }
}
