class Zepto{
	
	public static double takeOrder(String foodName){
	double price = 0.0;
	
	if(foodName == "Pongal"){
		price = 90.25;
	}
	else if(foodName == "Puttu"){
		price = 70.0;
	}
	
	else if(foodName == "Ragi mudhe"){
		price = 80.0;
	}
	
	else if(foodName == "Rasam"){
		price = 20.0;
	}
	
	else if(foodName == "Sajjige"){
		price = 40.0;
	}
	
	else if(foodName == "Sambar"){
		price = 20.0;
	}
	
	else if(foodName == "Sevai"){
		price = 65.0;
	}
	
	else if(foodName == "Thattai"){
		price = 45.0;
	}
	
	else if(foodName == "Uttapam "){
		price = 55.0;
	}
	
	else if(foodName == "Vada"){
		price = 30.0;
	}
	
	else if(foodName == "Barfi"){
		price = 70.0;
	}
	
	else if(foodName == "Basundi"){
		price = 80.0;
	}
	
	else if(foodName == "Dhokla"){
		price = 66.0;
	}
	
	else if(foodName == "Gulab jamun"){
		price = 120.0;
	}
	
	else if(foodName == "Laddu"){
		price = 35.0;
	}
	
	else if(foodName == "Modak"){
		price = 35.0;
	}
	
	else if(foodName == "Pav Bhaji"){
		price = 40.0;
	}
	
	else if(foodName == "Shankarpali"){
		price = 65.0;
	}
	
	else if(foodName == "Shrikhand"){
		price = 120.0;
	}
	
	else if(foodName == "Sohan papdi"){
		price = 155.0;
	}
	
	else if(foodName == "Sukhdi"){
		price = 130.0;
	}
	
	else if(foodName == "Momo"){
		price = 90.0;
	}
	
	else if(foodName == "Dal"){
		price = 29.0;
	}
	
	else if(foodName == "Peda"){
		price = 68.20;
	}
	
	else if(foodName == "Rasagola"){
		price = 120.0;
	}
	
	else if(foodName == "Kanji"){
		price = 60.0;
	}
	
	else if(foodName == "Kokum sharbat"){
		price = 50.0;
	}
	
	else if(foodName == "Ambil"){
		price = 40.0;
	}
	
	else if(foodName == "Buttermilk "){
		price = 35.0;
	}
	
	else if(foodName == "Sharjah"){
		price = 40.0;
	}
	
	else 
	System.out.println(foodName+" is not Found");
	
	return price;
	}

}