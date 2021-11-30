package com.xworkz.amazon.starter;

import com.xworkz.amazon.event.AmazonPrime;
import com.xworkz.amazon.exception.NotAPrimeMemberException;

public class AmazonStarter {

	public static void main(String[] args) throws NotAPrimeMemberException {

		AmazonPrime amazon=new AmazonPrime();
        amazon.freeDelivery(true, "India");
        System.out.println("even though there is data issue,Program is error free");

}

}

