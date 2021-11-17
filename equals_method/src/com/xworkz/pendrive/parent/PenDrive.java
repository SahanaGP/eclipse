package com.xworkz.pendrive.parent;

public class PenDrive {

	private int capacity;
	private boolean working;
	private String brand;
	private double price;
	
	public PenDrive()
	{
		System.out.println("Invoking pendrive with no-argument");
	}

	public String toString()
	{
		System.out.println("toString is invoked");
		
		System.out.println(this.capacity);
		System.out.println(this.working);
		System.out.println(this.brand);
		System.out.println(this.price);
		return "pendrive";
	}

	public int hashCode() {
		System.out.println("hashcode method is invoked");
		return 5657;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals from pendrive");
		if (obj != null) 
		{
			System.out.println("reference is not null");
			if (obj instanceof PenDrive) {
				System.out.println("reference is camera");
				PenDrive casted = (PenDrive) obj;
				String castedBrand = casted.getBrand();
				double castedPrice = casted.getPrice();
				if (this.brand.equals(castedBrand) && this.price == castedPrice)
				{
					System.out.println("brand and price are matching");
					return true;
				} 
				else {
					System.err.println("brand and price are not matching");
				}
			} 
			else {
				System.err.println("I cannot compare,refrence is not pendrive");
			}
		} 
		else {
			System.err.println("reference is null,pass proper ref!!!!");
		}
		return false;

	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
