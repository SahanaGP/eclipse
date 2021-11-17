package com.xworkz.watch.parent;

public class Watch {

	private String brand;
	private WatchTypes type;
	private float price;
	
    
	public Watch()
	{
		System.out.println("Invoking Watch with no-argument");
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals from watch");
		if (obj != null)
		{
			System.out.println("reference is not null");
			if (obj instanceof Watch) {
			System.out.println("reference is watch");	
			Watch casted = (Watch) obj;
			String castedWatchBrand = casted.getBrand();
			WatchTypes castedWatchType = casted.getType();
			if (this.brand.equals(castedWatchBrand) && this.type.equals(castedWatchType))
			{
				System.out.println("brand and type are matching");
			    return true;
	    	}
			else
			{
				System.err.println("brand or type are not matching");
			}
		}
		else {
			System.out.println("I cannot compare,ref is not a Watch");
		}
		}
		else {
			System.err.println("reference is null,pass proper reference!!!!!");
		}
		return false;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public WatchTypes getType() {
		return type;
	}

	public void setType(WatchTypes type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String toString()
	{
		 System.out.println("invoking tostring method from watch");
		 return "Watch";
	}
	
	public int hashCode()
	{
		 System.out.println("invoking hashcode method from Watch");
		 return 46787;
	}
}
