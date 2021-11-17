package com.xworkz.bag.parent;

public class Bag {

	private float price;
	private BagColours colour;
	private String sections;

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from bag");
		if (obj != null) {
			System.out.println("reference is not null");
			if (obj instanceof Bag)
			{
				System.out.println("refrence is Bag");
				Bag casted = (Bag) obj;
				BagColours castedColour = casted.getColour();
				float castedPrice = casted.getPrice();
				if (this.price == castedPrice && this.colour.equals(castedColour))
				{
					System.out.println("colour and price are matching");
					return true;
				} else
				{
					System.err.println("colour and price are not matching");
				}
			} else 
			{
				System.err.println("i cannot compare,refrence is not Bag");
			}
		} else
		{
			System.err.println("obj is null,pass proper ref!!!!");
		}
		return false;

	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public BagColours getColour() {
		return colour;
	}

	public void setColour(BagColours colour) {
		this.colour = colour;
	}

	public String getSections() {
		return sections;
	}

	public void setSections(String sections) {
		this.sections = sections;
	}

}

