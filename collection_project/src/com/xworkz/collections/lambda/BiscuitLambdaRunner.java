package com.xworkz.collections.lambda;

import com.xworkz.collections.dao.BiscuitDAO;
import com.xworkz.collections.dao.StringMatch;

public class BiscuitLambdaRunner {

public static void main(String[] args) {
		
		//anonymous class
		StringMatch stringMatch=new StringMatch()
				{
			public boolean evaluate(String element,String value)
			 {
				System.out.println("Invoked evaluate for equals");		
				return element.equals(value);

			 }
				};
				
				BiscuitDAO dao=new BiscuitDAO();
				
				boolean match=dao.find(stringMatch,"Parle-G");
				System.out.println(match);
		
				boolean match1=dao.find(new StringMatch()
						{
					public boolean evaluate(String element,String value)
					 {
						System.out.println("Invoked evaluate for equals");		
						return element.equals(value);

					 }
					
						}, "Parle-G");
				
				System.out.println(match1);

				//lambda expression
				boolean match2=dao.find((value1,value2)->value1.equals(value2),"Bourbon");
				System.out.println(match2);
				
				boolean match3=dao.find((value1,value2)->value1.equalsIgnoreCase(value2),"GOOD-day");
				System.out.println(match3);
				
				boolean match4=dao.find((value1,value2)->value1.toUpperCase().startsWith(value2.toUpperCase()),"Krac");
				System.out.println(match4);
				
				boolean match5=dao.find((value1,value2)->value1.toLowerCase().endsWith(value2.toLowerCase()),"EO");
				System.out.println(match5);
}

	
}

