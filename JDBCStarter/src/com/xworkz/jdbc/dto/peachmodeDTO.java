package com.xworkz.jdbc.dto;

import java.io.Serializable;

public class peachmodeDTO implements Serializable{

	private int id;
	private String name;
	private String email;
	private long phone;
	private String address;
	
	public peachmodeDTO(int id, String name, String email, long phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		
		return super.toString();
	}


	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
}
