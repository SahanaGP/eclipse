package com.xworkz.aeroplane.starter;

import com.xworkz.aeroplane.parent.Aeroplane;

public class AeroplaneStarter {

	public static void main(String[] args) {
		Aeroplane areo=new Aeroplane();
		areo.setNo(100);
		areo.setGovt("India");
		areo.setCompany("SouthWest airlines");

		Aeroplane areo1=new Aeroplane();
		areo1.setNo(100);
		areo1.setGovt("India");
		areo1.setCompany("Indigo");
		
		if (areo== areo1) {
			System.out.println("both are pointing to same memory location");
		}
		
		boolean same =areo.equals(areo1);
		System.out.println(same);
		}

}
