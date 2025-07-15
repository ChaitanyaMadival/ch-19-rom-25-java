class OlaRunner{

    public static void main(String ola[]) {
        System.out.println("Main Started");

        boolean accountCreated = Ola.createAccount("9123456789","Chaitanya","Bangalore","ola@12345","ola@12345");

        System.out.println("Is Account Created: " +accountCreated);

        if (accountCreated) {
            Ola.readAccount();
        }

        System.out.println("Main Ended");
    }
}
