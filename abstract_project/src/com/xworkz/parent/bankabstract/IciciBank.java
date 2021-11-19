package com.xworkz.parent.bankabstract;

public class IciciBank extends Bank {

	public IciciBank(String name1,String iciciCode)
	{
		super("ICICI","ICIC0000104");
	}
	
	public void provideLoan()
	{
		System.out.println("Invoking provide loan");
	}
	public void openAccount()
	{
		System.out.println("Invoking open account");
	}
	
	public void closeAccount()
	{
		System.out.println("Invoking close account");
	}
	

}
