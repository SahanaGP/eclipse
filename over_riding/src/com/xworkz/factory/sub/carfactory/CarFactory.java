package com.xworkz.factory.sub.carfactory;

import com.xworkz.factory.parent.Factory;

public class CarFactory extends Factory {

		public void manufacture()
		{
			System.out.println("invoking manufacture method from carfactory");
		}

		public void shutDown()
		{
			System.out.println("invoking shutdown method from carfactory");
		}
		
		public String toString()
		{
			System.out.println("invoking toString method from carfactory");
			return "carfactory";
		}
		
		public int hashCode()
		{
			System.out.println("invoking hashcode method from carfactory");
			return 45687;
		}
}

