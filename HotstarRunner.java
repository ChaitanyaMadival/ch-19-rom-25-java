class HotstarRunner {

    public static void main(String hotstar[]) {
        System.out.println("Main Started");

        boolean accountCreated = Hotstar.createAccount("cnm@hotstar.com","Chaitanya","Premium","@123","hotstar@123");

        System.out.println("Is Account Created: " +accountCreated);

        if (accountCreated) {
            Hotstar.readAccount();
        }

        System.out.println("Main Ended");
    }
}
