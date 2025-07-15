class Zepto{
	
	public static double takeOrder(String foodName){
	double price = 0.0;
	
	if(foodName == "Pongal"){
		price = 90.25;
		return price;
	}
	else if(foodName == "Puttu"){
		return 70.0;
	}
	
	else if(foodName == "Ragi mudhe"){
		price = 80.0;
		return price;
	}
	
	else if(foodName == "Rasam"){
		price = 20.0;
		return price;
	}
	
	else if(foodName == "Sajjige"){
		price = 40.0;
		return price;
	}
	
	else if(foodName == "Sambar"){
		price = 20.0;
		return price;
	}
	
	else if(foodName == "Sevai"){
		price = 65.0;
		return price;
	}
	
	else if(foodName == "Thattai"){
		price = 45.0;
		return price;
	}
	
	else if(foodName == "Uttapam"){
		price = 55.0;
		return price;
	}
	
	else if(foodName == "Vada"){
		price = 30.0;
		return price;
	}
	
	else if(foodName == "Barfi"){
		price = 70.0;
		return price;
	}
	
	else if(foodName == "Basundi"){
		price = 80.0;
		return price;
	}
	
	else if(foodName == "Dhokla"){
		price = 66.0;
		return price;
	}
	
	else if(foodName == "Gulab jamun"){
		price = 120.0;
		return price;
	}
	
	else if(foodName == "Laddu"){
		price = 35.0;
		return price;
	}
	
	else if(foodName == "Modak"){
		price = 35.0;
		return price;
	}
	
	else if(foodName == "Pav Bhaji"){
		price = 40.0;
		return price;
	}
	
	else if(foodName == "Shankarpali"){
		price = 65.0;
		return price;
	}
	
	else if(foodName == "Shrikhand"){
		price = 120.0;
		return price;
	}
	
	else if(foodName == "Sohan papdi"){
		price = 155.0;
		return price;
	}
	
	else if(foodName == "Sukhdi"){
		price = 130.0;
		return price;
	}
	
	else if(foodName == "Momo"){
		price = 90.0;
		return price;
	}
	
	else if(foodName == "Dal"){
		price = 29.0;
		return price;
	}
	
	else if(foodName == "Peda"){
		price = 68.20;
	}
	
	else if(foodName == "Rasagola"){
		price = 120.0;
		return price;
	}
	
	else if(foodName == "Kanji"){
		price = 60.0;
		 return price;
	}
	
	else if(foodName == "Kokum sharbat"){
		price = 50.0;
		return price;
	}
	
	else if(foodName == "Ambil"){
		price = 40.0;
		return price;
	}
	
	else if(foodName == "Buttermilk"){
		price = 35.0;
		return price;
	}
	
	else if(foodName == "Sharjah"){
		price = 40.0;
		return price;
	}
	
	else 
	System.out.println(foodName+" is not Found");
	
	return price;
	}
	
	public static double takeOrder(String foodName , int quantity){
		double price = 0.0;
		
	if(foodName == "Pongal"){
		price = 90.25 * quantity;
		return price;
	}
	else if(foodName == "Puttu"){
		return 70.0;
	}
	
	else if(foodName == "Ragi mudhe"){
		price = 80.0 * quantity;
		return price;
	}
	
	else if(foodName == "Rasam"){
		price = 20.0 * quantity;
		return price;
	}
	
	else if(foodName == "Sajjige"){
		price = 40.0 * quantity;
		return price;
	}
	
	else if(foodName == "Sambar"){
		price = 20.0 * quantity;
		return price;
	}
	
	else if(foodName == "Sevai"){
		price = 65.0 * quantity;
		return price;
	}
	
	else if(foodName == "Thattai"){
		price = 45.0 * quantity;
		return price;
	}
	
	else if(foodName == "Uttapam "){
		price = 55.0 *quantity;
		return price;
	}
	
	else if(foodName == "Vada"){
		price = 30.0*quantity;
		return price;
	}
	
	else if(foodName == "Barfi"){
		price = 70.0*quantity;
		return price;
	}
	
	else if(foodName == "Basundi"){
		price = 80.0*quantity;
		return price;
	}
	
	else if(foodName == "Dhokla"){
		price = 66.0*quantity;
		return price;
	}
	
	else if(foodName == "Gulab jamun"){
		price = 120.0*quantity;
		return price;
	}
	
	else if(foodName == "Laddu"){
		price = 35.0*quantity;
		return price;
	}
	
	else if(foodName == "Modak"){
		price = 35.0*quantity;
		return price;
	}
	
	else if(foodName == "Pav Bhaji"){
		price = 40.0*quantity;
		return price;
	}
	
	else if(foodName == "Shankarpali"){
		price = 65.0*quantity;
		return price;
	}
	
	else if(foodName == "Shrikhand"){
		price = 120.0*quantity;
		return price;
	}
	
	else if(foodName == "Sohan papdi"){
		price = 155.0*quantity;
		return price;
	}
	
	else if(foodName == "Sukhdi"){
		price = 130.0*quantity;
		return price;
	}
	
	else if(foodName == "Momo"){
		price = 90.0*quantity;
		return price;
	}
	
	else if(foodName == "Dal"){
		price = 29.0*quantity;
		return price;
	}
	
	else if(foodName == "Peda"){
		price = 68.20*quantity;
		return price;
	}
	
	else if(foodName == "Rasagola"){
		price = 120.0*quantity;
		return price;
	}
	
	else if(foodName == "Kanji"){
		price = 60.0*quantity;
		 return price;
	}
	
	else if(foodName == "Kokum sharbat"){
		price = 50.0*quantity;
		return price;
	}
	
	else if(foodName == "Ambil"){
		price = 40.0*quantity;
		return price;
	}
	
	else if(foodName == "Buttermilk"){
		price = 35.0*quantity;
		return price;
	}
	
	else if(foodName == "Sharjah"){
		price = 40.0*quantity;
		return price;
	}
	
	else 
	System.out.println(foodName+" is not Found");
	
	return price;
	}
	}