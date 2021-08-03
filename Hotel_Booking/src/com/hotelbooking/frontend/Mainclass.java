package com.hotelbooking.frontend;
import com.hotelbooking.entity.Customer;
import com.hotelbooking.entity.Booking_details;
import com.hotelbooking.entity.Hotel_users;
import com.hotelbooking.entity.Room_details;
public class Mainclass {

	public static void main(String[] args) 
	{
		
		Room_details rd= new Room_details(12345,1432,201,"Ac",1000,true);
		rd.viewRoomDetails();
		
		Customer c1 = new Customer(123,"ram168","user","rameshbommani",917749929,879999999,"hyd","ram@gmail.com");
		c1.CustomerDetails();
				

	}

}
