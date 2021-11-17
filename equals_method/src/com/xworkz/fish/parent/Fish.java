package com.xworkz.fish.parent;

public class Fish {

	private String name;
	private String colour;
	private FishType type;
	private double price;

	@Override
	public boolean equals(Object obj)
	{
		System.out.println("invoking equals from fish");
		if (obj != null)
		{
			System.out.println("reference is not null");
			if (obj instanceof Fish)
			{
				System.out.println("refrence is Fish");
				Fish casted = (Fish) obj;
				String castedName = casted.getName();
				String castedColour = casted.getColour();
				if (this.name.equals(castedName) && this.colour.equals(castedColour))
				{
					System.out.println("name and colour are matching");
					return true;
				} else {
					System.err.println("name and Colour are not matching");
				}
			} else {
				System.err.println("I cannot compare,reference is not Fish");
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public FishType getType() {
		return type;
	}

	public void setType(FishType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

