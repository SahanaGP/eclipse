package com.xworkz.city.dto;

import java.io.Serializable;

public class CityDTO implements Serializable{

	private int cId;
	private String cName;
	private float cPopulation;
	private String famousFor;
	
	public CityDTO(int cId, String cName, float cPopulation, String famousFor) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cPopulation = cPopulation;
		this.famousFor = famousFor;
	}

	@Override
	public String toString() {
		return "CityDTO [cId=" + cId + ", cName=" + cName + ", cPopulation=" + cPopulation + ", famousFor=" + famousFor
				+ "]";
	}

	public int getcId() {
		return cId;
	}

	public String getcName() {
		return cName;
	}

	public float getcPopulation() {
		return cPopulation;
	}

	public String getFamousFor() {
		return famousFor;
	}
	
	
}
