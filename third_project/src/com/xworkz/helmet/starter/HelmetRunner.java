package com.xworkz.helmet.starter;

import com.xworkz.helmet.HelmetClass;

public class HelmetRunner {

	public static void main(String[] args)
		
		{
			HelmetClass helm=new HelmetClass();
			
		    helm.add("Vega Ryker");
		    helm.add(null);
		    helm.displayHelmetBrandNames();
		    helm.add("Shark");
		    helm.add("MT");
		    helm.add("Bell");
		    helm.add("Studds");
		    helm.add("SMK");
		    helm.displayHelmetBrandNames();
		}
	}




