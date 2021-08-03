package com.hotelbooking.entity;

public class Booking_details 
{
	
	long booking_id;
	long room_id;
	long user_id;
	String booked_from;
	String booked_to;
	int no_of_adults;
	int no_of_children;
	long amount;
	
	public Booking_details(long booking_id, long room_id, long user_id, String booked_from, String booked_to,
			int no_of_adults, int no_of_children, long amount) 
	{
		super();
		this.booking_id = booking_id;
		this.room_id = room_id;
		this.user_id = user_id;
		this.booked_from = booked_from;
		this.booked_to = booked_to;
		this.no_of_adults = no_of_adults;
		this.no_of_children = no_of_children;
		this.amount = amount;
	}
	
	public void viewBookingDetails()
	{
		System.out.println("----------Booking Details----------");
		System.out.println("Booking Id:"+booking_id);
		System.out.println("Room Id:"+room_id);
		System.out.println("User Id:"+user_id);
		System.out.println("Booked from:"+booked_from);
		System.out.println("Booked To:"+booked_to);
		System.out.println("No Of Adults:"+no_of_adults);
		System.out.println("No Of Children:"+no_of_children);
		System.out.println("Amount paid:"+amount);
		System.out.println("=====================================");
	}
	
}
