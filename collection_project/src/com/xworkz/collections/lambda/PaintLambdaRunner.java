package com.xworkz.collections.lambda;

import com.xworkz.collections.dao.PaintDAO;
import com.xworkz.collections.dao.StringMatch;

public class PaintLambdaRunner {

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
				
				PaintDAO dao=new PaintDAO();
				
				boolean match=dao.find(stringMatch,"Asian");
				System.out.println(match);
		
				boolean match1=dao.find(new StringMatch()
						{
					public boolean evaluate(String element,String value)
					 {
						System.out.println("Invoked evaluate for equals");		
						return element.equals(value);

					 }
					
						}, "Asian");
				
				System.out.println(match1);

				boolean match2=dao.find((value1,value2)->value1.equals(value2),"Asian");
				System.out.println(match2);
				
				boolean match3=dao.find((value1,value2)->value1.equalsIgnoreCase(value2),"NIPPon");
				System.out.println(match3);
				
				boolean match4=dao.find((value1,value2)->value1.toUpperCase().startsWith(value2.toUpperCase()),"Dul");
				System.out.println(match4);
				
				boolean match5=dao.find((value1,value2)->value1.toLowerCase().endsWith(value2.toLowerCase()),"pon");
				System.out.println(match5);
}

	
}
