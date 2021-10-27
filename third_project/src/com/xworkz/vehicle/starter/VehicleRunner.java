package com.xworkz.vehicle.starter;

import com.xworkz.vehicle.VehicleClass;

public class VehicleRunner {

	public static void main(String[] args)
		
		{
			VehicleClass vehi=new VehicleClass();
			
		    vehi.add("Suzuki");
			vehi.add(null);
			vehi.displayVehicleBrandNames();
			vehi.add("BMW");
			vehi.add("Toyota");
			vehi.add("Honda");
			vehi.add("Swift");
			vehi.add("Maruthi800");
			vehi.displayVehicleBrandNames();
		}
	}
