class DoorDash {

	public static double takeOrder(String foodName){
	double price = 0.0;
	
	if(foodName == "Pistachio"){
		price = 99.99;
	}
	else if(foodName == "Choko Lava Cake"){
		price = 70.0;
	}
	
	else if(foodName == "Rich Donat"){
		price = 80.0;
	}
	
	else if(foodName == "Dream Cake"){
		price = 120.0;
	}
	
	else if(foodName == "Deth by choclate"){
		price = 100.0;
	}
	
	else if(foodName == "Bingo"){
		price = 20.0;
	}
	
	else if(foodName == "Curd"){
		price = 10.0;
	}
	
	else if(foodName == "Rock Choclate"){
		price = 100.0;
	}
	
	else if(foodName == "Pasta"){
		price = 65.0;
	}
	
	else if(foodName == "Akhni"){
		price = 50.0;
	}
	
	else if(foodName == "Arem-arem"){
		price = 190.30;
	}
	
	else if(foodName == "Bannu Pulao"){
		price = 50.0;
	}
	
	else if(foodName == "Bisi bele bath"){
		price = 45.0;
	}
	
	else if(foodName == "Bhelpuri"){
		price = 40.0;
	}
	
	else if(foodName == "Burasa"){
		price = 45.0;
	}
	
	else if(foodName == "Cabidela"){
		price = 199.0;
	}
	
	else if(foodName == "Curd rice"){
		price = 60.0;
	}
	
	else if(foodName == "Dolma"){
		price = 55.0;
	}
	
	else if(foodName == "Espasol"){
		price = 250.0;
	}
	
	else if(foodName == "Galho"){
		price = 330.0;
	}
	
	else if(foodName == "Gimbap"){
		price = 290.0;
	}
	
	else if(foodName == "Goto"){
		price = 340.0;
	}
	
	else if(foodName == "Gumbo"){
		price = 345.0;
	}
	
	else if(foodName == "Horchata"){
		price = 55.0;
	}
	
	else if(foodName == "Jambalaya"){
		price = 70.0;
	}
	
	else if(foodName == "Jibaro"){
		price = 70.0;
	}
	
	else if(foodName == "Jhalmuri"){
		price = 90.0;
	}
	
	else if(foodName == "Juk"){
		price = 60.0;
	}
	
	else if(foodName == "Khao lam"){
		price = 75.0;
	}
	
	else if(foodName == "Mochi"){
		price = 80.0;
	}
	
	else 
	System.out.println(foodName+" is not Found");
	
	return price;
	}

}