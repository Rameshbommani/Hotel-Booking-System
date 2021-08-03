package com.hotelbooking.entity;

public class Hotel_users 
{
	int hotel_id;
	String city;
	String hotel_name;
	String address;
	String description;
	long avg_rate_per_night;
	long phone;
	String email;
	
	public Hotel_users(int hotel_id,String city,String hotel_name,String address,String description,long avg_rate_per_night,long phone,String email)
	{
		this.hotel_id=hotel_id;
		this.city=city;
		this.hotel_name=hotel_name;
		this.address=address;
		this.description=description;
		this.avg_rate_per_night=avg_rate_per_night;
		this.phone=phone;
		this.email=email;
	}
	
	public void hotel_user_details()
	{
		System.out.println("----------Hotel User Details----------");
		System.out.println("Hotel_id       :"+hotel_id);
		System.out.println("city           :"+city);
		System.out.println("Hotel_name     :"+hotel_name);
		System.out.println("Address        :"+address);
		System.out.println("Description    :"+description);
		System.out.println("Rate per night :"+avg_rate_per_night);
		System.out.println("Phone          :"+phone);
		System.out.println("email          :"+email);
		System.out.println("============================================");
	}
}
