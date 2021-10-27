package com.xworkz.patient.operator;

public class MedicineOperator {
	private String[] container=new String[5];
	private int count=0;
	
	public MedicineOperator()
	{
		System.out.println("Invoking no-argument");
	}
	
	public void add(String medicineName)
	{
		System.out.println("Invoking add");
		
		if(medicineName!=null && this.count<this.container.length)
		{
			this.container[count]=medicineName;
			count++;
			System.out.println("Added medicine".concat(medicineName));
		}
		else
		{
			System.err.println("Medicine Name cannot be null or container is full");
		}
	}
	
	public void displayMedicineNames()
	{
		System.out.println("Invoking displayMedicineNames");
		for(int tablet=0;tablet<this.container.length;tablet++)
		{
			String ref=this.container[tablet];
			System.out.println(ref);
		}
	}

}
