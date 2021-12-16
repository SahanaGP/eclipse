package com.xworkz.collections.starter;

import com.xworkz.collections.dao.TrainNoDAO;
import com.xworkz.collections.dao.EndsWithMatches;
import com.xworkz.collections.dao.EqualsIgnoreCase;
import com.xworkz.collections.dao.EqualSearch;
import com.xworkz.collections.dao.StartsWithMatch;
import com.xworkz.collections.dao.StringMatch;


public class TrainNoStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrainNoDAO trainDAO=new TrainNoDAO();

		StringMatch stringMatch=new EqualSearch();
		boolean result=trainDAO.find(stringMatch, "DF47899");
		System.out.println(result);


		StringMatch stringMatch1=new EqualsIgnoreCase();
		boolean result1=trainDAO.find(stringMatch1, "we24356");
		System.out.println(result1);

		StringMatch stringMatch2=new StartsWithMatch();
		boolean result2=trainDAO.find(stringMatch2, "FH");
		System.out.println(result2);


		StringMatch stringMatch3=new EndsWithMatches();
		boolean result3=trainDAO.find(stringMatch3, "55");
		System.out.println(result3);



	}

}

 


