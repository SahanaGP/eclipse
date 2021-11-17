package com.xworkz.bridge.starter;

import com.xworkz.bridge.parent.Bridge;

public class BridgeStarter {

	public static void main(String[] args) {
		Bridge bridge = new Bridge();
		bridge.setLength(244.00f);
		bridge.setName("Tower bridge");
		bridge.setCost(88024420.80);
		bridge.setOpenYear(1894);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(bridge);
		System.out.println(bridge.hashCode()); 
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		Bridge bridge1 = new Bridge();
		bridge.setLength(244.00f);
		bridge1.setName("Tower bridge");
		bridge1.setCost(88024420.80);
		bridge1.setOpenYear(1894);

		Bridge bridge2 = new Bridge();
		Class clsss = bridge2.getClass();
		System.out.println(clsss.getName());
		System.out.println(clsss.getPackage());
		System.out.println(clsss.getSuperclass());
		System.out.println(clsss.getMethods().length);
		System.out.println(clsss.getFields().length);
		System.out.println(clsss.getConstructors().length);

		boolean same = bridge.equals(bridge1);
		System.out.println(same);
	}

}

