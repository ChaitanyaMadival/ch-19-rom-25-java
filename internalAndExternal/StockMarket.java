class StockMarket {
	/*
	static String reliance= "Reliance Industries Ltd";
	static String tataServices = "Tata Consultancy Services Ltd";
	static String hdfcBank = "HDFC Bank Ltd";
	static String bharatiAirtail = "Bharti Airtel Ltd";
	static String icicBank = "ICICI Bank Ltd";
	static String sbi = "State Bank of India";
	static String infosys = "Infosys Ltd";
	static String hindustaniLtd = "Hindustan Unilever Ltd";
	static String itc = "ITC Ltd";
	static String larsen = "Larsen & Toubro Ltd";
	
	static String stockNames[] = {reliance, tataServices, hdfcBank, bharatiAirtail, icicBank, sbi, infosys, hindustaniLtd, itc, larsen};
	*/
	public static void main(String stock[]) {
	
	System.out.println("Main Started");
		// System.out.println(stockNames[0]+", "+stockNames[1]+ ", "+stockNames[2]+ ", "+stockNames[3]+ ", "+stockNames[4]+ ", "+stockNames[5]
		//	+ ", "+stockNames[6]+ ", "+stockNames[7]+ ", "+stockNames[8]+ ", "+stockNames[9]);
	
		 String reliance= "Reliance Industries Ltd";
		 String tataServices = "Tata Consultancy Services Ltd";
		 String hdfcBank = "HDFC Bank Ltd";
		 String bharatiAirtail = "Bharti Airtel Ltd";
		 String icicBank = "ICICI Bank Ltd";
		 String sbi = "State Bank of India";
		 String infosys = "Infosys Ltd";
		 String hindustaniLtd = "Hindustan Unilever Ltd";
		 String itc = "ITC Ltd";
		 String larsen = "Larsen & Toubro Ltd";
		
		 String stockNames[] = {reliance, tataServices, hdfcBank, bharatiAirtail, icicBank, sbi, infosys, hindustaniLtd, itc, larsen};
	
		for(String stockName :stockNames) {
			System.out.println(stockName);
		}
	System.out.println("Main Ended");
	}
}