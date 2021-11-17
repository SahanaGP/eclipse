package com.xworkz.pendrive.starter;

import com.xworkz.pendrive.parent.PenDrive;
public class PenDriveStarter {

	public static void main(String[] args) {
		PenDrive pen = new PenDrive();
		pen.setBrand("sandisk");
		pen.setCapacity(16);
		pen.setPrice(450);
		pen.setWorking(true);

		PenDrive pen1 = new PenDrive();
		pen1.setBrand("sandisk");
		pen1.setCapacity(16);
		pen1.setPrice(450);
		pen1.setWorking(false);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		pen1.toString();
        System.out.println(pen1);
		System.out.println(pen1.hashCode()); 
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		PenDrive pen2 = new PenDrive();
		Class clsss = pen2.getClass();
		System.out.println(clsss.getName());
		System.out.println(clsss.getPackage());
		System.out.println(clsss.getSuperclass());
		System.out.println(clsss.getMethods().length);
		System.out.println(clsss.getFields().length);
		System.out.println(clsss.getConstructors().length);

		
		boolean same = pen.equals(pen1);
		System.out.println(same);
	}

}

