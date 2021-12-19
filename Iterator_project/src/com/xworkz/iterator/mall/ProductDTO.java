package com.xworkz.iterator.mall;

import java.io.Serializable;

public class ProductDTO implements Serializable {
	
	private String name;
	private int id;
	private float price;
	private String manufacturer;
	
	
	public ProductDTO()
	{
		System.out.println("Invoked product dto");
	}


	public ProductDTO(String name, int id, float price, String manufacturer) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.manufacturer = manufacturer;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
		

}

