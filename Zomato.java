class Zomato{

	public static double takeOrder(String foodName){
	double price = 0.0;
	
	if(foodName == "Pani puri"){
		price = 30.0;
	}
	else if(foodName == "Papad"){
		price = 35.0;
	}
	
	else if(foodName == "Panjeeri"){
		price = 40.0;
	}
	
	else if(foodName == "Paratha"){
		price = 20.0;
	}
	
	else if(foodName == "Pattor"){
		price = 90.0;
	}
	
	else if(foodName == "Phirni"){
		price = 65.0;
	}
	
	else if(foodName == "Pinni"){
		price = 70.0;
	}
	
	else if(foodName == "Rajma"){
		price = 100.0;
	}
	
	else if(foodName == "Samosa"){
		price = 35.0;
	}
	
	else if(foodName == "Halwa"){
		price = 40.0;
	}
	
	else if(foodName == "Bhajji"){
		price = 30.0;
	}
	
	else if(foodName == "Bonda"){
		price = 50.0;
	}
	
	else if(foodName == "Dosa"){
		price = 70.0;
	}
	
	else if(foodName == "Goli bajje"){
		price = 50.0;
	}
	
	else if(foodName == "Idiyappam"){
		price = 50.0;
	}
	
	else if(foodName == "Idli"){
		price = 25.0;
	}
	
	else if(foodName == "omelette"){
		price = 40.0;
	}
	
	else if(foodName == "Kanji"){
		price = 35.0;
	}
	
	else if(foodName == "Kodubale"){
		price = 25.0;
	}
	
	else if(foodName == "kolhapuri"){
		price = 70.0;
	}
	
	else if(foodName == "Koottu"){
		price = 65.0;
	}
	
	else if(foodName == "Koshambri"){
		price = 30.0;
	}
	
	else if(foodName == "Kuzhakkattai"){
		price = 40.0;
	}
	
	else if(foodName == "Kuzhambu"){
		price = 59.0;
	}
	
	else if(foodName == "Obbattu"){
		price = 40.0;
	}
	
	else if(foodName == "Olan"){
		price = 55.0;
	}
	
	else if(foodName == "Pachadi"){
		price = 45.0;
	}
	
	else if(foodName == "Papadum"){
		price = 55.0;
	}
	
	else if(foodName == "Paravannam"){
		price = 42.0;
	}
	
	else if(foodName == "Payasam"){
		price = 30.0;
	}
	else 
	System.out.println(foodName+" is not Found");
	
	return price;
	}
	
}