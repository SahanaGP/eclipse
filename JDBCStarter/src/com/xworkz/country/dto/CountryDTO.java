package com.xworkz.country.dto;

import java.io.Serializable;

public class CountryDTO implements Serializable{

	private int cId;
	private String cName;
	private int cCode;
	private String continents;
	
	public CountryDTO(int cId, String cName, int cCode, String continents) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cCode = cCode;
		this.continents = continents;
	}

	@Override
	public String toString() {
		return "CountryDTO [cId=" + cId + ", cName=" + cName + ", cCode=" + cCode + ", continents=" + continents + "]";
	}

	public int getcId() {
		return cId;
	}

	public String getcName() {
		return cName;
	}

	public int getcCode() {
		return cCode;
	}

	public String getContinents() {
		return continents;
	}
	
	
}
