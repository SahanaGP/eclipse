package com.xworkz.stadium.starter;

import com.xworkz.stadium.parent.Stadium;
public class StadiumStarter {

	public static void main(String[] args) {
		Stadium stadium = new Stadium();
		stadium.setName("Chidambaram");
		stadium.setCity("Chennai");
		stadium.setAreaInMeters(500.00f);

		Stadium stadium1 = new Stadium();
		stadium1.setName("Chinnaswamy");
		stadium1.setCity("Bangalore");
		stadium1.setAreaInMeters(1000.00f);

		if (stadium == stadium1) {
			System.out.println("both are pointing to same memory location");
		}
		boolean same = stadium.equals(stadium1);
		System.out.println(same);

	}

}

