class StockMarket {
	
	static String stockNames[] = {"Reliance Industries Ltd", "Tata Consultancy Services Ltd", "HDFC Bank Ltd", "Bharti Airtel Ltd", "ICICI Bank Ltd", "State Bank of India", "Infosys Ltd", "Hindustan Unilever Ltd", "ITC Ltd", "Larsen & Toubro Ltd"};
	
	public static void main(String stock[]) {
	
		// System.out.println(stockNames[0]+", "+stockNames[1]+ ", "+stockNames[2]+ ", "+stockNames[3]+ ", "+stockNames[4]+ ", "+stockNames[5]
		//	+ ", "+stockNames[6]+ ", "+stockNames[7]+ ", "+stockNames[8]+ ", "+stockNames[9]);
	
		for(String stockName :stockNames) {
			System.out.println(stockName);
		}
	}
}