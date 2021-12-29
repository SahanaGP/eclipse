package com.xworkz.festival.dto;

import java.io.Serializable;

public class FestivalDTO implements Serializable {

	private int fid;
	private String fname;
	private int fdate;
	private String fstate;
	
	public FestivalDTO(int fid, String fname,int fdate, String fstate) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fdate = fdate;
		this.fstate = fstate;
	}


	@Override
	public String toString() {
		return "FestivalDTO [fid=" + fid + ", fname=" + fname + ", fdate=" + fdate + ", fstate=" + fstate + "]";
	}


	public int getFid() {
		return fid;
	}


	public String getFname() {
		return fname;
	}


	public int getFdate() {
		return fdate;
	}


	public String getFstate() {
		return fstate;
	}

	
	
	
	
}
