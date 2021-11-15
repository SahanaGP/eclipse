package com.xworkz.factoryrunner;

import com.xworkz.factory.parent.Factory;
import com.xworkz.factory.sub.carfactory.CarFactory;
import com.xworkz.factory.sub.sugarfactory.SugarFactory;

public class FactoryRunner {

	public static void main(String[] args)
	{
		Factory fact=new Factory();
		fact.manufacture();
		fact.open();
		fact.shutDown();
		fact.toString();
		fact.hashCode();
		System.out.println("--------------------------------------------");
		System.out.println(fact);
		System.out.println(fact.toString());
		System.out.println(fact.hashCode());
		System.out.println("--------------------------------------------");
		

		Factory carfact=new CarFactory();
		carfact.manufacture();
		carfact.open();
		carfact.toString();
		carfact.hashCode();
		System.out.println("--------------------------------------------");
		System.out.println(carfact.toString());
		System.out.println(carfact.hashCode());
		System.out.println(carfact);
		System.out.println("--------------------------------------------");

		
		Factory sugarfact=new SugarFactory();
		sugarfact.manufacture();
		sugarfact.shutDown();
		sugarfact.toString();	
		sugarfact.hashCode();
		System.out.println("--------------------------------------------");
		System.out.println(sugarfact.toString());
		System.out.println(sugarfact.hashCode());
		System.out.println(sugarfact);
		System.out.println("--------------------------------------------");

	}

}

