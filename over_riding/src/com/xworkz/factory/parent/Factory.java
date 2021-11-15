package com.xworkz.factory.parent;

public class Factory {

	public void manufacture()
	{
	     System.out.println("invoking manufacture method from factory");
	}
	
	public void open()
	{
		 System.out.println("invoking open method from factory");
	}
	
	public void shutDown()
	{
		 System.out.println("invoking shutdown method from factory");
	}
	
	public String toString()
	{
		 System.out.println("invoking tostring method from factory");
		 return "factory";
	}
	
	public int hashCode()
	{
		 System.out.println("invoking hashcode method from factory");
		 return 4657;
	}

}
