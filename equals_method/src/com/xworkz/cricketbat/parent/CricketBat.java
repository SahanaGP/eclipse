package com.xworkz.cricketbat.parent;

public class CricketBat {

	private String companyName;
	private BatType type;
	private float price;
	private boolean wood;
	
	public CricketBat()
	{
		System.out.println("Invoking cricketbat with no-argument");
	}
	
	public String toString()
	{
		System.out.println("toString is invoked");

		System.out.println(this.companyName);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.wood);
		return "bat";
	}
	
	public int hashCode()
	{
		System.out.println("hashcode method is invoked from Cricketbat");
		return 23456;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals from cricketbat");
		if (obj != null) 
		{
			System.out.println("reference is not null");
			if (obj instanceof CricketBat) {
				System.out.println("reference is cricketbat");
				CricketBat casted = (CricketBat) obj;
				String castedName = casted.getCompanyName();
				if (this.companyName.equals(castedName))
				{
					System.out.println("name is matching");
					return true;
				} 
				else {
					System.err.println("name is not matching");
				}
			} 
			else {
				System.err.println("I cannot compare,refrence is not cricketbat");
			}
		} 
		else {
			System.err.println("reference is null,pass proper ref!!!!");
		}
		return false;

	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public BatType getType() {
		return type;
	}
	public void setType(BatType type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isWood() {
		return wood;
	}
	public void setWood(boolean wood) {
		this.wood = wood;
	}
	
	
}
