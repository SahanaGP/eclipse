package com.xworkz.factory.sub.sugarfactory;

import com.xworkz.factory.parent.Factory;

public class SugarFactory extends Factory {

		public void manufacture()
		{
			System.out.println("invoking manufacture method from sugarfactory");
		}
		
		public String toString()
		{
			System.out.println("invoking toString method from sugarfactory");
			return "sugarfactory";
		}
		
		public int hashCode()
		{
			System.out.println("invoking hashcode method from sugarfactory");
			return 2345;
		}
	
}
