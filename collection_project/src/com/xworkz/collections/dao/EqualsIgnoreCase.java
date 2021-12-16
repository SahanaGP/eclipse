package com.xworkz.collections.dao;

public class EqualsIgnoreCase implements StringMatch {

	public boolean evaluate(String element,String value) {
		return element.equalsIgnoreCase(value);
	}


}
