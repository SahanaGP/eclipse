package com.xworkz.collections.starter;

import com.xworkz.collections.dao.PaintDAO;
import com.xworkz.collections.dao.EndsWithMatches;
import com.xworkz.collections.dao.EqualsIgnoreCase;
import com.xworkz.collections.dao.EqualSearch;
import com.xworkz.collections.dao.StartsWithMatch;
import com.xworkz.collections.dao.StringMatch;

public class PaintStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

PaintDAO cigDAO=new PaintDAO();

		StringMatch stringMatch=new EqualSearch();
		boolean result=cigDAO.find(stringMatch, "Berger");
		System.out.println(result);


		StringMatch stringMatch1=new EqualsIgnoreCase();
		boolean result1=cigDAO.find(stringMatch1, "ASIAN");
		System.out.println(result1);

		StringMatch stringMatch2=new StartsWithMatch();
		boolean result2=cigDAO.find(stringMatch2, "Ni");
		System.out.println(result2);


		StringMatch stringMatch3=new EndsWithMatches();
		boolean result3=cigDAO.find(stringMatch3, "ON");
		System.out.println(result3);



	}

}
