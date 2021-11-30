package com.xworkz.medical.event;

import com.xworkz.medical.exception.CashLessException;

public class MedicalInsurance {

	public MedicalInsurance()
	{
		System.out.println("Invoking Medical Insurance");
	}

    public void canAvailableCashless(String name,double totalHoursInHospital) throws CashLessException
	{
		if(name != null && name.length() > 2 && name.length() <= 26 && totalHoursInHospital >= 30)
		{
			System.out.println("Can available cashless Medical Insurance");
		}
        else
		{
			System.err.println("Cannot available cashless Medical Insurance");
        }
	}
}
