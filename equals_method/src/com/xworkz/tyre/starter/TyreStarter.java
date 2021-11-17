package com.xworkz.tyre.starter;

import com.xworkz.tyre.parent.Tyre;
import com.xworkz.tyre.parent.TyreType;

public class TyreStarter {

	public static void main(String[] args) {
		Tyre tyre=new Tyre();
		tyre.setBrand("MRF");
		tyre.setPrice(5000);
		tyre.setType(TyreType.SUMMER);


		Tyre tyre1=new Tyre();
		tyre1.setBrand("MRF");
		tyre1.setPrice(8000);
		tyre1.setType(TyreType.SUMMER);


		if (tyre== tyre1) {
			System.out.println("both are pointing to same memory location");
		}
		
		boolean same =tyre.equals(tyre1);
		System.out.println(same);
		}
}
