package com.xworkz.parent.bankabstract;

public abstract class Bank {

	private String name;
	private String ifscCode;
	
	public Bank(String name,String ifscCode)
	{
		System.out.println("Invoking bank");
		this.name=name;
		this.ifscCode=ifscCode;
	}
	
	public abstract void provideLoan();
	public abstract void openAccount();
	public abstract void closeAccount();
	
	public String getBankName()
	{
		System.out.println("Invoking getBankName");
		String bankName=this.name;
		return bankName;
	}
	
	public String getIfscCode()
	{
		System.out.println("Invoking getIfscCode");
		String ifscCode=this.ifscCode;
		return ifscCode;
	}

}
