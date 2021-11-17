package com.xworkz.bridge.parent;

public class Bridge {

	private String name;
	private float length;
	private double cost;
	private int openYear;
	
    public Bridge()
    {
    	System.out.println("Invoking bridge with no-argument");
    }

	public String toString() {
		System.out.println("toString is invoked");
		
		System.out.println(this.name);
		System.out.println(this.length);
		System.out.println(this.cost);
		System.out.println(this.openYear);
		return "bridge";
	}

	public int hashCode()
	{

		System.out.println("hashcode method is invoked from bridge");
		return 2456;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals from bridge");
		if (obj != null) 
		{
			System.out.println("reference is not null");
			if (obj instanceof Bridge) {
				System.out.println("reference is cricketbat");
				Bridge casted = (Bridge) obj;
				String castedName = casted.getName();
				int castedYear = casted.getOpenYear();
				if (this.name.equals(castedName) && this.openYear == castedYear)
				{
					System.out.println("name and year are matching");
					return true;
				} 
				else {
					System.err.println("name and year are not matching");
				}
			} 
			else {
				System.err.println("I cannot compare,refrence is not bridge");
			}
		} 
		else {
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

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getOpenYear() {
		return openYear;
	}

	public void setOpenYear(int openYear) {
		this.openYear = openYear;
	}

	
}
