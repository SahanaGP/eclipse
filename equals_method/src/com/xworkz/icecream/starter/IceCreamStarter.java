package com.xworkz.icecream.starter;

import  com.xworkz.parent.icecream.IceCream;
import  com.xworkz.parent.icecream.FlavourTypes;
import  com.xworkz.parent.icecream.IceCreamType;

public class IceCreamStarter {

	public static void main(String[] args)
	{
		IceCream ice = new IceCream();
		ice.setFlavour(FlavourTypes.CHOCOLATE);
		ice.setName("Arun icecreams");
		ice.setType(IceCreamType.KULFI);
		
		IceCream ice1 = new IceCream();
		ice1.setFlavour(FlavourTypes.CHOCOLATE);
		ice1.setName("Arun icecreams");
		ice1.setType(IceCreamType.CONE);

		if (ice == ice1)
		{
			System.out.println("both are pointing to same memory location");
		}
		
		boolean same = ice.equals(ice1);
		System.out.println(same);
	}

}
