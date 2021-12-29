package com.xworkz.icecream.dto;

import java.io.Serializable;

public class IceCreamDTO implements Serializable {

	private int creamId;
	private String cFlavour;
	private String cName;
	private float cPrice;
	
	public IceCreamDTO(int creamId, String cFlavour, String cName, float cPrice) {
		super();
		this.creamId = creamId;
		this.cFlavour = cFlavour;
		this.cName = cName;
		this.cPrice = cPrice;
	}

	@Override
	public String toString() {
		return "IceCreamDTO [creamId=" + creamId + ", cFlavour=" + cFlavour + ", cName=" + cName + ", cPrice=" + cPrice
				+ "]";
	}

	public int getCreamId() {
		return creamId;
	}

	public String getcFlavour() {
		return cFlavour;
	}

	public String getcName() {
		return cName;
	}

	public float getcPrice() {
		return cPrice;
	}
	
	
}
