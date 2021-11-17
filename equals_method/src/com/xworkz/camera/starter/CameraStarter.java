package com.xworkz.camera.starter;

import com.xworkz.camera.parent.Camera;

public class CameraStarter {

	public static void main(String[] args) {
		Camera camera = new Camera();
		camera.setBrand("sony");
		camera.setModelNo(90);
		camera.setCompany("slr");
		camera.setPrice(60000);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		camera.toString();
        System.out.println(camera);
		System.out.println(camera.hashCode()); 
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		Camera camera1 = new Camera();
		camera1.setBrand("sony");
		camera1.setModelNo(50);
		camera1.setCompany("slr");
		camera1.setPrice(60000);

		Camera camera2 = new Camera();
		Class clsss = camera2.getClass();
		System.out.println(clsss.getName());
		System.out.println(clsss.getPackage());
		System.out.println(clsss.getSuperclass());
		System.out.println(clsss.getMethods().length);
		System.out.println(clsss.getFields().length);
		System.out.println(clsss.getConstructors().length);

		boolean same = camera.equals(camera1);
		System.out.println(same);
	}

}
