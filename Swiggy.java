class Swiggy{

	public static double takeOrder(String foodName){
	double price = 0.0;
	
	if(foodName == "Pizza"){
		price = 199.99;
		return price;
	}
	else if(foodName == "Burger"){
		price = 120.0;
		return price;
	}
	
	else if(foodName == "Aloo gobi"){
		price = 90.0;
		return price;
	}
	
	else if(foodName == "Aloo tikki"){
		price = 65.0;
		return price;
	}
	
	else if(foodName == "Aloo tuk"){
		price = 60.0;
		return price;
	}
	
	else if(foodName == "Aloo kulcha"){
		price = 45.0;
		return price;
	}
	
	else if(foodName == "Aloo methi"){
		price = 50.0;
		return price;
	}
	
	else if(foodName == "Baati"){
		price = 60.0;
		return price;
	}
	
	else if(foodName == "Bhatura"){
		price = 70.0;
		return price;
	}
	
	else if(foodName == "Biryani"){
		price = 155.0;
		return price;
	}
	
	else if(foodName == "Chaat"){
		price = 30.0;
		return price;
	}
	
	else if(foodName == "Chana masala"){
		price = 40.0;
		return price;
	}
	
	else if(foodName == "Chapati"){
		price = 35.0;
		return price;
	}
	
	else if(foodName == "Chicken Tikka"){
		price = 189.0;
		return price;
	}
	
	else if(foodName == "Chole bhature"){
		price = 120.0;
		return price;
	}
	
	else if(foodName == "Daal puri"){
		price = 65.0;
		return price;
	}
	
	else if(foodName == "Poha"){
		price = 60.0;
		return price;
	}
	
	else if(foodName == "Fara"){
		price = 230.0;
		return price;
	}
	
	else if(foodName == "Jalebi"){
		price = 90.0;
		return price;
	}
	
	else if(foodName == "Kachori"){
		price = 45.0;
		return price;
	}
	
	else if(foodName == "Kadai paneer"){
		price = 130.0;
		return price;
	}
	
	else if(foodName == "Karela bharta"){
		price = 140.0;
		return price;
	}
	
	else if(foodName == "Kheer"){
		price = 90.0;
		return price;
	}
	
	else if(foodName == "Khichdi"){
		price = 68.0;
		return price;
	}
	
	else if(foodName == "Kofta"){
		price = 90.0;
		return price;
	}
	
	else if(foodName == "Lassi"){
		price = 20.0;
		return price;
	}
	
	else if(foodName == "Mirchi Bada"){
		price = 40.0;
		return price;
	}
	
	else if(foodName == "Missi roti"){
		price = 60.0;
		return price;
	}
	
	else if(foodName == "Naan"){
		price = 77.0;
		return price;
	}
	
	else if(foodName == "Pakhala"){
		price = 90.0;
		return price;
	}
	
	else 
	System.out.println(foodName+" is not Found");
	
	return price;
	}
	
	public static double takeOrder(String foodName, int quantity){
	double price = 0.0;
	
	if(foodName == "Pizza"){
		price = 199.99 * quantity;
		return price;
	}
	else if(foodName == "Burger"){
		price = 120.0*quantity;
		return price;
	}
	
	else if(foodName == "Aloo gobi"){
		price = 90.0*quantity;
		return price;
	}
	
	else if(foodName == "Aloo tikki"){
		price = 65.0*quantity;
		return price;
	}
	
	else if(foodName == "Aloo tuk"){
		price = 60.0*quantity;
		return price;
	}
	
	else if(foodName == "Aloo kulcha"){
		price = 45.0*quantity;
		return price;
	}
	
	else if(foodName == "Aloo methi"){
		price = 50.0*quantity;
		return price;
	}
	
	else if(foodName == "Baati"){
		price = 60.0*quantity;
		return price;
	}
	
	else if(foodName == "Bhatura"){
		price = 70.0*quantity;
		return price;
	}
	
	else if(foodName == "Biryani"){
		price = 155.0*quantity;
		return price;
	}
	
	else if(foodName == "Chaat"){
		price = 30.0*quantity;
		return price;
	}
	
	else if(foodName == "Chana masala"){
		price = 40.0*quantity;
		return price;
	}
	
	else if(foodName == "Chapati"){
		price = 35.0*quantity;
		return price;
	}
	
	else if(foodName == "Chicken Tikka"){
		price = 189.0*quantity;
		return price;
	}
	
	else if(foodName == "Chole bhature"){
		price = 120.0*quantity;
		return price;
	}
	
	else if(foodName == "Daal puri"){
		price = 65.0*quantity;
		return price;
	}
	
	else if(foodName == "Poha"){
		price = 60.0;
		return price;
	}
	
	else if(foodName == "Fara"){
		price = 230.0*quantity;
		return price;
	}
	
	else if(foodName == "Jalebi"){
		price = 90.0*quantity;
		return price;
	}
	
	else if(foodName == "Kachori"){
		price = 45.0*quantity;
		return price;
	}
	
	else if(foodName == "Kadai paneer"){
		price = 130.0*quantity;
		return price;
	}
	
	else if(foodName == "Karela bharta"){
		price = 140.0*quantity;
		return price;
	}
	
	else if(foodName == "Kheer"){
		price = 90.0*quantity;
		return price;
	}
	
	else if(foodName == "Khichdi"){
		price = 68.0*quantity;
		return price;
	}
	
	else if(foodName == "Kofta"){
		price = 90.0*quantity;
		return price;
	}
	
	else if(foodName == "Lassi"){
		price = 20.0*quantity;
		return price;
	}
	
	else if(foodName == "Mirchi Bada"){
		price = 40.0*quantity;
		return price;
	}
	
	else if(foodName == "Missi roti"){
		price = 60.0;
		return price;
	}
	
	else if(foodName == "Naan"){
		price = 77.0*quantity;
		return price;
	}
	
	else if(foodName == "Pakhala"){
		price = 90.0*quantity;
		return price;
	}
	
	else 
	System.out.println(foodName+" is not Found");
	
	return price;
	}
}