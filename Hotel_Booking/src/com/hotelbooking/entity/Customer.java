package com.hotelbooking.entity;

public class Customer 
{

	int user_id;
	String password;
	String role;
	String user_name;
	long mobile_no;
	long phone;
	String address;
	String email;


	public Customer(int user_id,String password,String role,String user_name,long mobile_no,long phone,String address,String email)
	{
		this.user_id=user_id;
		this.password=password;
		this.role=role;
		this.user_name= user_name;
	    this.mobile_no= mobile_no;
		this.phone= phone;
		this.address= address;
		this.email= email;
	}
	
	public void CustomerDetails()
	{
		System.out.println();
		System.out.println("----------Customer Details----------");
		System.out.println("user id       :"+user_id);
		System.out.println("password      :"+password);
		System.out.println("role          :"+user_id);
		System.out.println("user Name     :"+user_name);
		System.out.println("mobile Number :"+mobile_no);
		System.out.println("phone number  :"+phone);
		System.out.println("address       :"+address);
		System.out.println("email         :"+email);
		System.out.println("====================================");
	}

}
