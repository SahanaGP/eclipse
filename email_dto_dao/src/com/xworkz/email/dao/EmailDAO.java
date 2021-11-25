package com.xworkz.email.dao;

import com.xworkz.email.dto.EmailDTO;

import com.xworkz.outlookemail.dto.OutlookEmailDTO;

import com.xworkz.gmailemail.dto.GmailEmailDTO;

public class EmailDAO {
	
	private EmailDTO[] email=new EmailDTO[5];
	private int count;
	private OutlookEmailDTO test1;
	private GmailEmailDTO test2;
	
	public EmailDAO()
	{
		System.out.println("INVOKED EMAILDAO");
	}
	
	public void save(EmailDTO emailDTO)
	{
		if(emailDTO!=null && this.count<this.email.length)
		{
			this.email[count]=emailDTO;
			System.out.println("EMAILDTO IS SAVED");
			this.count++;
		}
		else
		{
			System.err.println("EMAIL IS FULL");
		}
	}
	
	public void save(OutlookEmailDTO outLookEmailDTO)
	{
		if(outLookEmailDTO!=null && this.count<this.email.length)
		{
			this.email[count]=outLookEmailDTO;
		    System.out.println("OUTLOOKEMAILDTO IS SAVED");
		    this.count++;
		}
		else
	  {
		System.err.println("EMAIL IS FULL");
	  }
	}

	public void save(GmailEmailDTO gmailEmailDTO)
	{
		if(gmailEmailDTO!=null && this.count<this.email.length)
		{
			this.email[count]=gmailEmailDTO;
		    System.out.println("GMAILEMAILDTO IS SAVED");
		    this.count++;
		}
		else
	  {
		System.err.println("EMAIL IS FULL");
	  }
	}
	
	public void displayDetailsEmailDTO() {

		for(int display=0;display<this.email.length;display++)
		{
			EmailDTO test=this.email[display];
			if(test!=null)
			{

				System.out.println(String.valueOf(test.getStorageSize()).concat(" ").concat(String.valueOf(test.getFree())).concat(" ").
						concat(String.valueOf(test.getNoOfEmailPerDay())).concat(" ").concat(test.getEmailId()));
			}

		}
	}
	
	public void displayDetailsOutLookEmailDTO() {

		for(int display1=0;display1<this.email.length;display1++)
		{

			System.out.println(test1.getCloudStorage());
			System.out.println(test1.isBackUp());
			OutlookEmailDTO value=(OutlookEmailDTO)this.email[display1];
			if(value!=null)
			{

				System.out.println(String.valueOf(test1.getCloudStorage()).concat(" ").concat(String.valueOf(test1.isBackUp())));
			}
			else
			{
				System.err.println("NULL");
			}

		}
	}
	
	public void displayDetailsGmailEmailDTO() {

		for(int display2=0;display2<this.email.length;display2++)
		{

			System.out.println(test2.getThemeColor());
			System.out.println(test2.isSubscribed());
			GmailEmailDTO value1=(GmailEmailDTO)this.email[display2];
			if(value1!=null)
			{

				System.out.println(test2.getThemeColor().concat(" ").concat(String.valueOf(test2.isSubscribed())));
			}

		}
	}
}


