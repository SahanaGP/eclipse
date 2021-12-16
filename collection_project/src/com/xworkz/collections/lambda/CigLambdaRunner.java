package com.xworkz.collections.lambda;

import com.xworkz.collections.dao.CigaretteDAO;
import com.xworkz.collections.dao.StringMatch;

public class CigLambdaRunner {

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
				
				CigaretteDAO dao=new CigaretteDAO();
				
				boolean match=dao.find(stringMatch,"Kool");
				System.out.println(match);
		
				boolean match1=dao.find(new StringMatch()
						{
					public boolean evaluate(String element,String value)
					 {
						System.out.println("Invoked evaluate for equals");		
						return element.equals(value);

					 }
					
						}, "Kool");
				
				System.out.println(match1);

				boolean match2=dao.find((value1,value2)->value1.equals(value2),"Kool");
				System.out.println(match2);
				
				boolean match3=dao.find((value1,value2)->value1.equalsIgnoreCase(value2),"LUCKYStrike");
				System.out.println(match3);
				
				boolean match4=dao.find((value1,value2)->value1.toUpperCase().startsWith(value2.toUpperCase()),"Marl");
				System.out.println(match4);
				
				boolean match5=dao.find((value1,value2)->value1.toLowerCase().endsWith(value2.toLowerCase()),"Port");
				System.out.println(match5);
}

	
}
