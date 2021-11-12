package com.xworkz.email.all.starter;

import com.xworkz.email.dao.EmailDAO;
import com.xworkz.email.dto.EmailDTO;
import com.xworkz.outlookemail.dto.OutlookEmailDTO;
import com.xworkz.gmailemail.dto.GmailEmailDTO;

public class EmailStarter {

	public static void main(String[] args) {
		EmailDAO emailDAO=new EmailDAO();
		EmailDTO emailDTO=new EmailDTO(900,false,80,"saha123@gmail.com");
		emailDAO.save(emailDTO);
		OutlookEmailDTO outLookEmailDTO=new OutlookEmailDTO(500,true,90,"saaa1@gmail.com",670,true); 
		emailDAO.save(outLookEmailDTO);
		GmailEmailDTO gmailEmailDTO=new GmailEmailDTO(400,false,50,"saha12345@gmail.com","White",true);
		emailDAO.save(gmailEmailDTO);
		emailDAO.displayDetailsEmailDTO();
		emailDAO.displayDetailsOutLookEmailDTO();
		emailDAO.displayDetailsGmailEmailDTO();
	}

}

	


