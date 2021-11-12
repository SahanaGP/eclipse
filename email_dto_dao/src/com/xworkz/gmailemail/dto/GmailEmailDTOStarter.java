package com.xworkz.gmailemail.dto;

public class GmailEmailDTOStarter {

	public static void main(String[] args) {
	
		GmailEmailDTO gmail=new GmailEmailDTO();
		
		gmail.setThemeColor("BLACK");
		gmail.setSubscribed(true);


		System.out.println(gmail.getThemeColor());
		System.out.println(gmail.isSubscribed());



	}

}
