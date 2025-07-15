class CountryRunner{

	public static void main(String country[]){
		System.out.println("Main Started");
		
		String countryName = "Pak";
		int countryCode = Country.getCountryCode(countryName);
		System.out.println("The Country code of " +countryName+ " is "+countryCode);
		
		System.out.println("Main Started");
	}
}