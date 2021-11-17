package com.xworkz.belt.parent;

public class Belt {

	private double price;
	private String material;
	private String size;
	private String gender;

	@Override
	public boolean equals(Object obj)
	{
		System.out.println("invoking equals from Belt");
		if (obj != null)
		{
			System.out.println("reference is not null");
			if (obj instanceof Belt) 
			{
				System.out.println("reference is belt");
				Belt casted = (Belt) obj;
				String castedMaterial = casted.getMaterial();
				String castedsize = casted.getSize();
				if (this.material.equals(castedMaterial) && this.size.equals(castedsize)) 
				{
					System.out.println("material and size are matching");
					return true;
				} else
				{
					System.err.println("material and size are not matching");
				}
			} else
			{
				System.err.println("I cannot compare,reference is not belt");
			}
		} else 
		{
			System.err.println("reference is null,pass proper ref!!!!");
		}
		return false;

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



}
