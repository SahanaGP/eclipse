package com.xworkz.food.parent;

public class Food {

	private String name;
	private double price;
	private float quantity;
	private boolean quality;

	@Override
	public boolean equals(Object obj)
	{
		System.out.println("invoking equals from food");
		if (obj != null)
		{
			System.out.println("reference is not null");
			if (obj instanceof Food) 
			{
				System.out.println("reference is Food");
				Food casted = (Food) obj;
				String castedName = casted.getName();
				boolean castedQuality = casted.isQuality();
				if (this.name.equals(castedName) && this.quality == castedQuality)
				{
					System.out.println("name and quality are matching");
					return true;
				} else {
					System.err.println("name and quality are not matching");
				}
			} else {
				System.err.println("I cannot compare,reference is not food");
			}
		} else {
			System.err.println("reference is null,pass proper ref!!!!");
		}
		return false;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

}
