package com.xworkz.shoe.parent;

public class Shoe {

	private String brand;
	private int size;
	private String colour;
	private String gender;

	@Override
	public boolean equals(Object obj)
	{
		System.out.println("invoking equals from shoe");
		if (obj != null) {
			System.out.println("reference is not null");
			if (obj instanceof Shoe) 
			{
				System.out.println("reference is Shoe");
				Shoe casted = (Shoe) obj;
				String castedBrand = casted.getBrand();
				String castedColour = casted.getColour();
				if (this.brand.equals(castedBrand) && this.colour.equals(castedColour))
				{
					System.out.println("brand and color are matching");
					return true;
				} else 
				{
					System.err.println("brand and color are not matching");
				}
			} else
			{
				System.err.println("I cannot compare,reference is not shoe");
			}
		} else 
		{
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}

