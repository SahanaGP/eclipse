package com.xworkz.equals.watch.starter;

import com.xworkz.watch.parent.Watch;
import com.xworkz.watch.parent.WatchTypes;

public class WatchStarter {

	public static void main(String[] args) {
	     
		Watch watch = new Watch();
		watch.setBrand("Emperor");
		watch.setType(WatchTypes.ANALOG);
		watch.setPrice(8000);

		Watch watch2 = new Watch();
		watch2.setBrand("Emperor");
		watch2.setType(WatchTypes.ANALOG);
		watch2.setPrice(9000);

		if(watch==watch2)
		{
			System.out.println("both are pointing to same memory location");
		}
		
		boolean same = watch.equals(watch2);
		System.out.println(same);
		
		System.out.println(watch);
		
		System.out.println(watch.hashCode());
	}
}
	
	


