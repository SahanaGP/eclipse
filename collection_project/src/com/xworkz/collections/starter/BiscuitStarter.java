package com.xworkz.collections.starter;

import com.xworkz.collections.dao.BiscuitDAO;
import com.xworkz.collections.dao.EndsWithMatches;
import com.xworkz.collections.dao.EqualsIgnoreCase;
import com.xworkz.collections.dao.EqualSearch;
import com.xworkz.collections.dao.StartsWithMatch;
import com.xworkz.collections.dao.StringMatch;

public class BiscuitStarter {

	public static void main(String[] args) {

		BiscuitDAO biscuitDAO=new BiscuitDAO();

		StringMatch stringMatch=new EqualSearch();
		boolean result=biscuitDAO.find(stringMatch, "Oreo");
		System.out.println(result);


		StringMatch stringMatch1=new EqualsIgnoreCase();
		boolean result1=biscuitDAO.find(stringMatch1, "OREO");
		System.out.println(result1);

		StringMatch stringMatch2=new StartsWithMatch();
		boolean result2=biscuitDAO.find(stringMatch2, "Or");
		System.out.println(result2);


		StringMatch stringMatch3=new EndsWithMatches();
		boolean result3=biscuitDAO.find(stringMatch3, "eo");
		System.out.println(result3);



	}

}

