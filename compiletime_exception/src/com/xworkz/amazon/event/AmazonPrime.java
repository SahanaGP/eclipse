package com.xworkz.amazon.event;

import com.xworkz.amazon.exception.NotAPrimeMemberException;

public class AmazonPrime {
	
	public AmazonPrime()
	{
		System.out.println("Invoking amazon prime");
	}


	public void freeDelivery(boolean primeMember,String country) throws NotAPrimeMemberException
	{
		if(primeMember && country=="India")
		{
			System.out.println("Free delivery is available");
		}

		else
		{
			System.err.println("Free delivery is not available ");
		}
	}
}
