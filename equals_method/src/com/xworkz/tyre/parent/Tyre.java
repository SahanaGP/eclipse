package com.xworkz.tyre.parent;

public class Tyre {

	private String brand;
	private TyreType type;
	private double price;

	@Override
	public boolean equals(Object obj) 
	{
		System.out.println("invoking equals from Tyre");
		if (obj != null)
		{
			System.out.println("reference is not null");
			if (obj instanceof Tyre)
			{
				System.out.println("reference is Tyre");
				Tyre casted = (Tyre) obj;
				String castedBrand = casted.getBrand();
				TyreType castedType = casted.getType();
				if (this.brand.equals(castedBrand) && this.type.equals(castedType))
				{
					System.out.println("brand and type are matching");
					return true;
				} else {
					System.err.println("brand and type are not matching");
				}
			} else {
				System.err.println("I cannot compare,reference is not Tyre");
			}
		} else {
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

	public TyreType getType() {
		return type;
	}

	public void setType(TyreType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
