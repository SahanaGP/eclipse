package com.xworkz.email.dto;

public class EmailDTO
{

	private double storageSize;
	private boolean free;
	private int noOfEmailPerDay;
	private String emailId;

	public EmailDTO()
	{

	}
	
	public EmailDTO(double storageSize, boolean free, int noOfEmailPerDay, String emailId) {
		super();
		this.storageSize = storageSize;
		this.free = free;
		this.noOfEmailPerDay = noOfEmailPerDay;
		this.emailId = emailId;
	}
	public double getStorageSize() {
		return storageSize;
	}
	public void setStorageSize(float storageSize) {
		this.storageSize = storageSize;
	}
	public boolean getFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
	public int getNoOfEmailPerDay() {
		return noOfEmailPerDay;
	}
	public void setNoOfEmailPerDay(int noOfEmailPerDay) {
		this.noOfEmailPerDay = noOfEmailPerDay;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


}
