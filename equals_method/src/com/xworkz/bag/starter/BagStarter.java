package com.xworkz.bag.starter;

import com.xworkz.bag.parent.Bag;
import com.xworkz.bag.parent.BagColours;

public class BagStarter {

	public static void main(String[] args) {
		Bag bag = new Bag();
		bag.setSections("school");
		bag.setColour(BagColours.BLACK);
		bag.setPrice(1000.00f);

		Bag bag1 = new Bag();
		bag1.setSections("school");
		bag1.setColour(BagColours.BLACK);
		bag1.setPrice(1000.00f);

		if (bag == bag1) {
			System.out.println("both are pointing to same memory location");
		}
		
		boolean same = bag.equals(bag1);
		System.out.println(same);
	}
}
