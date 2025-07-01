class Library {
	
	static String bookNames[] = {"Think Like A Monk", "Don't talk Build", "5 AM Club", "Rich Dad Poor Dad", "The Notebook", "Harry Potter", "Lost Sea", "Two State"};
	
	public static void main(String library[]) {
	
		//System.out.println(bookNames[0]+ ", "+bookNames[1]+ ", "+bookNames[2]+ ", "+bookNames[3]+ ", "+bookNames[4]+ ", "+bookNames[5]+ ", "+bookNames[6]+ ", "+bookNames[7]);
		for(String bookName : bookNames){
			System.out.println(bookName);
		}
	}
}