package com.xworkz.gmailemail.dto;

import com.xworkz.email.dto.EmailDTO;

public class GmailEmailDTO extends EmailDTO{

	private String themeColor;
	private boolean subscribed;

	public GmailEmailDTO()
	{

	}
	
	public GmailEmailDTO(float storageSize, boolean free, int noOfEmailPerDay, String emailId, String themeColor,
			boolean subscribed) 
	{
		super(storageSize, free, noOfEmailPerDay, emailId);
		this.themeColor = themeColor;
		this.subscribed = subscribed;
	}
	
	public String getThemeColor() {
		return themeColor;
	}
	
	public void setThemeColor(String themeColor) {
		this.themeColor = themeColor;
	}
	
	public boolean isSubscribed() {
		return subscribed;
	}
	
	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}

}

