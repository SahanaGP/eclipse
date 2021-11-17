package com.xworkz.stadium.parent;

public class Stadium {

	private String name;
	private String city;
	private float areaInMeters;

	@Override
	public boolean equals(Object obj) 
	{
		System.out.println("invoking equals from stadium");
		if (obj != null) {
			System.out.println("reference is not null");
			if (obj instanceof Stadium) {
				System.out.println("reference is Stadium");
				Stadium casted = (Stadium) obj;
				String castedName = casted.getName();
				String castedCity = casted.getCity();
				if (this.name.equals(castedName) && this.city.equals(castedCity)) {
					System.out.println("name and city are matching");
					return true;
				} else 
				{
					System.err.println("name and City are not matching");
				}
			} else {
				System.err.println("I cannot compare,reference is not Stadium");
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getAreaInMeters() {
		return areaInMeters;
	}

	public void setAreaInMeters(float areaInMeters) {
		this.areaInMeters = areaInMeters;
	}

}

