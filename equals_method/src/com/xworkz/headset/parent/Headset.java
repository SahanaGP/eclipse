package com.xworkz.headset.parent;

public class Headset {

	private String brand;
	private HeadsetTypes type;
	private float battery;
	private int warranty;
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals from headset");
		if (obj != null) 
		{
			System.out.println("reference is not null");
			if (obj instanceof Headset) {
				System.out.println("reference is Headset");
				Headset casted = (Headset) obj;
				String castedBrand = casted.getBrand();
				int castedWarranty = casted.getWarranty();
				if (this.brand.equals(castedBrand) && this.warranty == castedWarranty)
				{
					System.out.println("brand and warranty are matching");
					return true;
				} 
				else {
					System.err.println("brand and warranty are not matching");
				}
			} 
			else {
				System.err.println("I cannot compare,refrence is not headset");
			}
		} 
		else {
			System.err.println("reference is null,pass proper ref!!!!");
		}
		return false;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public HeadsetTypes getType() {
		return type;
	}

	public void setType(HeadsetTypes type) {
		this.type = type;
	}

	public float getBattery() {
		return battery;
	}

	public void setBattery(float battery) {
		this.battery = battery;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

}

