package com.xworkz.sweet.starter;

import com.xworkz.sweet.parent.Sweet;
import com.xworkz.sweet.parent.Colours;
import com.xworkz.sweet.parent.ShapeType;
public class SweetStarter {

	public static void main(String[] args) {
	Sweet sweet = new Sweet();
	sweet.setColor(Colours.Brown);
	sweet.setName("Jamoon");
	sweet.setPrice(100);
	sweet.setShape(ShapeType.Round);

	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	sweet.toString();
    System.out.println(sweet);
	System.out.println(sweet.hashCode()); 
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");


	Sweet sweet1 = new Sweet();
	sweet1.setColor(Colours.Brown);
	sweet1.setName("Jamoon");
	sweet1.setPrice(100);
	sweet1.setShape(ShapeType.Round);
	
	Sweet sweet2 = new Sweet();
	Class clsss = sweet2.getClass();
	System.out.println(clsss.getName());
	System.out.println(clsss.getPackage());
	System.out.println(clsss.getSuperclass());
	System.out.println(clsss.getMethods().length);
	System.out.println(clsss.getFields().length);
	System.out.println(clsss.getConstructors().length);
	
	boolean same = sweet.equals(sweet1);
	System.out.println(same);
}

}

