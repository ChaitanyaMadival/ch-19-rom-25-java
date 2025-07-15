class UberEats{

	public static double takeOrder(String foodName){
	double price = 0.0;
	
	if(foodName == "Black tea"){
		price = 30.0;
	}
	else if(foodName == "Chocolate cake"){
		price = 500.0;
	}
	
	else if(foodName == "Donuts"){
		price = 90.0;
	}
	
	else if(foodName == "Jam"){
		price = 80.0;
	}
	
	else if(foodName == "French fries"){
		price = 120.0;
	}
	
	else if(foodName == "Popcorn"){
		price = 70.0;
	}
	
	else if(foodName == "Kebab"){
		price = 179.9;
	}
	
	else if(foodName == "Pasta"){
		price = 90.0;
	}
	
	else if(foodName == "Pudding"){
		price = 120.0;
	}
	
	else if(foodName == "Egg roll"){
		price = 70.0;
	}
	
	else if(foodName == "Sandwiches"){
		price = 89.0;
	}
	
	else if(foodName == "Hot dog"){
		price = 120.0;
	}
	
	else if(foodName == "Soup"){
		price = 90.0;
	}
	
	else if(foodName == "Sushi"){
		price = 274.0;
	}
	
	else if(foodName == "Bagel"){
		price = 129.0;
	}
	
	else if(foodName == "Idli"){
		price = 30.0;
	}
	
	else if(foodName == "Oatmeal"){
		price = 65.0;
	}
	
	else if(foodName == "Peanut butter"){
		price = 40.0;
	}
	
	else if(foodName == "pancake"){
		price = 80.0;
	}
	
	else if(foodName == "Smoothie"){
		price = 65.0;
	}
	
	else if(foodName == "Kulcha"){
		price = 70.0;
	}
	
	else if(foodName == "Leben"){
		price = 55.0;
	}
	
	else if(foodName == "Yogurt"){
		price = 15.0;
	}
	
	else if(foodName == "Corn"){
		price = 25.0;
	}
	
	else if(foodName == "Toast"){
		price = 55.0;
	}
	
	else if(foodName == "Croissant"){
		price = 95.0;
	}
	
	else if(foodName == "Banana"){
		price = 40.0;
	}
	
	else if(foodName == "Date fruit"){
		price = 129.0;
	}
	
	else if(foodName == "Cherry"){
		price = 160.0;
	}
	
	else if(foodName == "Watermelon"){
		price = 50.0;
	}
	
	else 
	System.out.println(foodName+" is not Found");
	
	return price;
	}

}