package com.xworkz.parent.bankabstract;

public class HdfcBank extends Bank {

	public HdfcBank(String name,String Code)
	{
		super("HDFC","HDFC0000077");
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
