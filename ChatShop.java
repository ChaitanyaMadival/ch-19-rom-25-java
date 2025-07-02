class ChatShop {	 
	/*
	static String paniPuri = "Pani Puri";
	static String belPuri = "Bhel Puri";
	static String sevPuri = "Sev Puri";
	static String dhaiPuri = "Dhai Puri";
	static String alooTikka = "Aloo Tikka";
	static String samosa = "Samosa";
	static String kachori = "Kachori";
	static String freanchFries = "French fries";
	static String sandwitch = "Sandwich";
	static String vadaPav = "Vada Pav";
	
	static String chats[] = {paniPuri, belPuri, sevPuri,dhaiPuri, alooTikka, samosa, kachori, freanchFries, sandwitch, vadaPav};
	*/
	public static void main(String chatshop[]) {
	
	System.out.println("Main Started");
	 String paniPuri = "Pani Puri";
	 String belPuri = "Bhel Puri";
	 String sevPuri = "Sev Puri";
	 String dhaiPuri = "Dhai Puri";
	 String alooTikka = "Aloo Tikka";
	 String samosa = "Samosa";
	 String kachori = "Kachori";
	 String freanchFries = "French fries";
	 String sandwitch = "Sandwich";
	 String vadaPav = "Vada Pav";
	
	String chats[] = {paniPuri, belPuri, sevPuri,dhaiPuri, alooTikka, samosa, kachori, freanchFries, sandwitch, vadaPav};
	/*System.out.println(chats[0]+ " "+chats[1]+ " "+chats[2]+ " "+chats[3]+ " "+chats[4]+ " "+chats[5]+ " "+
		chats[6]+ " "+chats[7]+ " "+chats[8]+ " "+chats[9]);
	*/
	for(String chat: chats){
		System.out.println(chat);
	}
	System.out.println("Main Ended");
	}
}