package com.xworkz.belt.starter;

import com.xworkz.belt.parent.Belt;

public class BeltStarter {

	public static void main(String[] args) {
		Belt belt = new Belt();
		belt.setPrice(800.00d);
		belt.setMaterial("Leather");
		belt.setSize("large");
		belt.setGender("male");

		Belt belt1 = new Belt();
		belt1.setPrice(900);
		belt1.setMaterial("Leather");
		belt1.setSize("large");
		belt1.setGender("female");

		if (belt == belt1) 
		{
			System.out.println("both are pointing to same memory location");
		}
		
		boolean same = belt.equals(belt1);
		System.out.println(same);

	}

}
