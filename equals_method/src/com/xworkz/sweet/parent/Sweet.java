package com.xworkz.sweet.parent;

public class Sweet {

	private Colours color;
	private ShapeType shape;
	private String name;
	private double price;
	
    public  Sweet()
    {
    	System.out.println("Invoking sweet with no-argument");
    }

    public String toString() {
    	System.out.println("toString is invoked");
    	
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.color);
		System.out.println(this.shape);
		return "sweet";
	}

	public int hashCode() {
		System.out.println("hashcode method is invoked");
		return 8723;
	}

    @Override
    public boolean equals(Object obj) {
	System.out.println("invoking equals from sweet");
	if (obj != null) 
	{
		System.out.println("reference is not null");
		if (obj instanceof Sweet) {
			System.out.println("reference is sweet");
			Sweet casted = (Sweet) obj;
			String castedName = casted.getName();
			double castedPrice = casted.getPrice();
			if (this.name.equals(castedName) && this.price == castedPrice)
			{
				System.out.println("name and price are matching");
				return true;
			} 
			else {
				System.err.println("name and price are not matching");
			}
		} 
		else {
			System.err.println("I cannot compare,refrence is not sweet");
		}
	} 
	else {
		System.err.println("reference is null,pass proper ref!!!!");
	}
	return false;

}
    
    
	public Colours getColor() {
		return color;
	}

	public void setColor(Colours color) {
		this.color = color;
	}

	public ShapeType getShape() {
		return shape;
	}

	public void setShape(ShapeType shape) {
		this.shape = shape;
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
}
