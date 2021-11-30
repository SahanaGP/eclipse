package com.xworkz.election.starter;

import com.xworkz.election.ElectoralCommission;
import com.xworkz.election.exception.NotEligibleForVoteException;

public class ElectoralStarter {

	public static void main(String[] args)throws NotEligibleForVoteException {

		ElectoralCommission commission=new ElectoralCommission();
        commission.canVote("Sahana", 22);
        System.out.println("even though there is data issue,Program is error free");
    
	}
}
