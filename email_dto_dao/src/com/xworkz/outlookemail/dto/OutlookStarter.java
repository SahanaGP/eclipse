package com.xworkz.outlookemail.dto;

public class OutlookStarter {

	public static void main(String[] args) {

			OutlookEmailDTO outlook=new OutlookEmailDTO();
			
			outlook.setCloudStorage(1000);
			outlook.setBackUp(true);


			System.out.println(outlook.getCloudStorage());
			System.out.println(outlook.isBackUp());


		}


	}


