package com.xworkz.state.dto;

import java.io.Serializable;

public class StateDTO implements Serializable {

	private int sId;
	private String sName;
	private int sCode;
	private String sCapital;
	
	public StateDTO(int sId, String sName, int sCode, String sCapital) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sCode = sCode;
		this.sCapital = sCapital;
	}

	@Override
	public String toString() {
		return "StateDTO [sId=" + sId + ", sName=" + sName + ", sCode=" + sCode + ", sCapital=" + sCapital + "]";
	}

	public int getsId() {
		return sId;
	}

	public String getsName() {
		return sName;
	}

	public int getsCode() {
		return sCode;
	}

	public String getsCapital() {
		return sCapital;
	}
	
	
}
