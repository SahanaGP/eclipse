package com.xworkz.election;

import com.xworkz.election.exception.NotEligibleForVoteException;

public class ElectoralCommission {

	public ElectoralCommission()
	{
		System.out.println("Invoking electoral commission");
	}

	public void canVote(String name,int age) throws NotEligibleForVoteException
	{
		if(name != null && name.length() > 2 && name.length() <= 26 && age > 18)
		{
			System.out.println("Person is eligible for vote");
		}
		else
		{
			System.err.println("Person is not Eligible for vote");
		}
	}

}

