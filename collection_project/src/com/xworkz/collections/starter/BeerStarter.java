package com.xworkz.collections.starter;

import com.xworkz.collections.dao.BeerDAO;
import com.xworkz.collections.dao.EndsWithMatches;
import com.xworkz.collections.dao.EqualsIgnoreCase;
import com.xworkz.collections.dao.EqualSearch;
import com.xworkz.collections.dao.StartsWithMatch;
import com.xworkz.collections.dao.StringMatch;


public class BeerStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

BeerDAO beerDAO=new BeerDAO();

		StringMatch stringMatch=new EqualSearch();
		boolean result=beerDAO.find(stringMatch, "KingFisher");
		System.out.println(result);


		StringMatch stringMatch1=new EqualsIgnoreCase();
		boolean result1=beerDAO.find(stringMatch1, "KINGfisher");
		System.out.println(result1);

		StringMatch stringMatch2=new StartsWithMatch();
		boolean result2=beerDAO.find(stringMatch2, "Ki");
		System.out.println(result2);


		StringMatch stringMatch3=new EndsWithMatches();
		boolean result3=beerDAO.find(stringMatch3, "ll");
		System.out.println(result3);



	}

}
