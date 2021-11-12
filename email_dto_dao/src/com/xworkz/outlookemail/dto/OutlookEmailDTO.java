package com.xworkz.outlookemail.dto;

import com.xworkz.email.dto.EmailDTO;

public class OutlookEmailDTO extends EmailDTO {

	private double cloudStorage;
	private boolean backUp;
	
	public  OutlookEmailDTO()
	{

	}
	
	public OutlookEmailDTO(float storageSize, boolean free, int noOfEmailPerDay, String emailId, double cloudStorage,
			boolean backUp)
	{
		super(storageSize, free, noOfEmailPerDay, emailId);
		this.cloudStorage = cloudStorage;
		this.backUp = backUp;
	}



	public double getCloudStorage() {
		return cloudStorage;
	}
	public void setCloudStorage(double cloudStorage) {
		this.cloudStorage = cloudStorage;
	}
	public boolean isBackUp() {
		return backUp;
	}
	public void setBackUp(boolean backUp) {
		this.backUp = backUp;
	}

}

