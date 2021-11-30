package com.xworkz.medical.starter;

import com.xworkz.medical.event.MedicalInsurance;
import com.xworkz.medical.exception.CashLessException;

public class MedicalStarter {

	public static void main(String[] args) throws CashLessException
	{
		MedicalInsurance medical=new MedicalInsurance();
        medical.canAvailableCashless("Raaju", 50);
        System.out.println("even though there is data issue,Program is error free");
	}
}

