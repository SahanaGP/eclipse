package com.xworkz.patients;

import com.xworkz.patient.operator.MedicineOperator;

public class MedicineStarter {

	public static void main(String[] args)
	
	{
		MedicineOperator operator=new MedicineOperator();
		
		operator.add("Dolo-650");
		operator.add(null);
		operator.displayMedicineNames();
		operator.add("PAN-D");
		operator.add("Gudcef");
		operator.add("Omee");
		operator.add("Montecop");
		operator.add("Maxodom");
		operator.displayMedicineNames();
	}
}
