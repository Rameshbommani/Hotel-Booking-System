package com.hotelbooking.entity;

public class Room_details 
{
	int hotel_id;
	int room_id;
	int room_num;
	String room_type;
	int per_night_rate;
	Boolean avilability;
	//blob photo;
	public Room_details(int hotel_id, int room_id, int room_num, String room_type, int per_night_rate,
			Boolean avilability) {
		//super();
		this.hotel_id = hotel_id;
		this.room_id = room_id;
		this.room_num = room_num;
		this.room_type = room_type;
		this.per_night_rate = per_night_rate;
		this.avilability = avilability;
	}
	
	
	
	public void viewRoomDetails()
	{
		System.out.println("----------Room Details----------");
		System.out.println("Hotel Id       :"+hotel_id);
		System.out.println("Room Id        :"+room_id);
		System.out.println("Room Number    :"+room_num);
		System.out.println("Room Type      :"+room_type);
		System.out.println("Rate Per Night :"+per_night_rate);
		System.out.println("Avilability    :"+avilability);
		
	}
	
	
}
