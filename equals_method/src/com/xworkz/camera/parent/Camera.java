package com.xworkz.camera.parent;

public class Camera {

	private String brand;
	private int modelNo;
	private double price;
	private String company;
	
	public Camera()
    {
    	System.out.println("Invoking camera with no-argument");
    }
	
	public String toString()
	{
		System.out.println("toString is invoked");
		
		System.out.println(this.brand);
		System.out.println(this.modelNo);
		System.out.println(this.price);
		System.out.println(this.company);
		return "camera";
	}
	
	public int hashCode()
	{

		System.out.println("hashcode method is invoked from Camera");
		return 3456;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals from camera");
		if (obj != null) 
		{
			System.out.println("reference is not null");
			if (obj instanceof Camera) {
				System.out.println("reference is camera");
				Camera casted = (Camera) obj;
				String castedBrand = casted.getBrand();
				double castedPrice = casted.getPrice();
				if (this.brand.equals(castedBrand) && this.price == castedPrice)
				{
					System.out.println("brand and price are matching");
					return true;
				} 
				else {
					System.err.println("brand and price are not matching");
				}
			} 
			else {
				System.err.println("I cannot compare,refrence is not camera");
			}
		} 
		else {
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
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
}
