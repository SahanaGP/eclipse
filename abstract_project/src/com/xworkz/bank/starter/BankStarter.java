package com.xworkz.bank.starter;

import com.xworkz.parent.bankabstract.Bank;
import com.xworkz.parent.bankabstract.HdfcBank;
import com.xworkz.parent.bankabstract.IciciBank;

public class BankStarter {

	public static void main(String[] args)
	{
		Bank bank = new HdfcBank("Hdfc","HDFC0000076");
			bank.provideLoan();
			bank.closeAccount();
			bank.openAccount();
			
			String name=bank.getBankName();
			System.out.println(name);
			String code=bank.getIfscCode();
			System.out.println(code);
			
		Bank bank1 = new IciciBank("Icici","ICIC0000202");
			bank1.provideLoan();
			bank1.closeAccount();
			bank1.openAccount();
			
			String name1=bank.getBankName();
			System.out.println(name1);
			String iciciCode=bank.getIfscCode();
			System.out.println(iciciCode);
	}
}
