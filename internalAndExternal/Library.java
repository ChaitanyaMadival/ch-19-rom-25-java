class Library {
	/*
	static String thinkLikeMonk = "Think Like A Monk";
	static String dontTalkBuild = "Don't talk Build";
	static String club = "5 AM Club";
	static String richPoorDad = "Rich Dad Poor Dad";
	static String notebook = "The Notebook";
	static String harryPotter = "Harry Potter";
	static String lostSea = "Lost Sea";
	static String twoState = "Two State";
	
	static String bookNames[] = {thinkLikeMonk, dontTalkBuild, club, richPoorDad, notebook, harryPotter, lostSea, twoState};
	*/
	public static void main(String library[]) {
	
	System.out.println("Main Started");
		//System.out.println(bookNames[0]+ ", "+bookNames[1]+ ", "+bookNames[2]+ ", "+bookNames[3]+ ", "+bookNames[4]+ ", "+bookNames[5]+ ", "+bookNames[6]+ ", "+bookNames[7]);
		 String thinkLikeMonk = "Think Like A Monk";
		 String dontTalkBuild = "Don't talk Build";
		 String club = "5 AM Club";
		 String richPoorDad = "Rich Dad Poor Dad";
		 String notebook = "The Notebook";
		 String harryPotter = "Harry Potter";
		 String lostSea = "Lost Sea";
		 String twoState = "Two State";
		
		 String bookNames[] = {thinkLikeMonk, dontTalkBuild, club, richPoorDad, notebook, harryPotter, lostSea, twoState};
		
			
		for(String bookName : bookNames){
			System.out.println(bookName);
		}
	System.out.println("Main Ended");
	}
}