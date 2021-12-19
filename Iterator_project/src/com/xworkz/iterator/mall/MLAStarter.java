package com.xworkz.iterator.mall;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class MLAStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> mla=new HashSet<String>();
		
		mla.add("M.Srinivas");
		mla.add("K.Ventakesh");
		mla.add("A.Manju");
		mla.add("Prakash.H.S");
		mla.add("Shivakumar.D.K");
		mla.add("Nagaraju.M.V");
		
		for(String element:mla)
 		{
 			System.out.println(element);
 		}
 		
 		System.out.println("-------------------------------------------------------");

	
 		mla.forEach((e)->System.out.println(e));
 		
 		System.out.println("-------------------------------------------------------");

 		Iterator<String> itr=mla.iterator();
 		while(itr.hasNext())
 		{
 			String element=itr.next();
 			System.out.println(element);
 		}
 	

}
}
