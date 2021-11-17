package com.xworkz.cricketbat.starter;

import com.xworkz.cricketbat.parent.CricketBat;
import com.xworkz.cricketbat.parent.BatType;

public class CricketBatStarter {

	public static void main(String[] args) {
		CricketBat cricket=new CricketBat();
		cricket.setCompanyName("adidas");
		cricket.setType(BatType.MRF);
		cricket.setPrice(20000);
		cricket.setWood(true);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(cricket);
		System.out.println(cricket.hashCode()); 
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        CricketBat cricket1=new CricketBat();
		cricket1.setCompanyName("adidas");
		cricket1.setType(BatType.KASHMIR_WILLOW);
		cricket1.setPrice(30000);
		cricket.setWood(false);

		CricketBat cricket2=new CricketBat();
		Class clsss= cricket2.getClass();
		System.out.println(clsss.getName());
		System.out.println(clsss.getPackage());
		System.out.println(clsss.getSuperclass());
		System.out.println(clsss.getMethods().length);
		System.out.println(clsss.getFields().length);
		System.out.println(clsss.getConstructors().length);

		boolean same=cricket.equals(cricket1);
		System.out.println(same);
	}

}

