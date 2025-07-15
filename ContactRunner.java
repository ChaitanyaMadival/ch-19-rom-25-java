class ContactRunner{

	public static void main(String contact[]){
		System.out.println("Main Started");
		
		String name = "cnm";
		long contactNumber = Contact.getPhoneNumberByName(name);
		System.out.println("Contact number of "+ name+ " is "+contactNumber);
		//System.out.println();
		
		System.out.println("Main Ended");
	
	}
}