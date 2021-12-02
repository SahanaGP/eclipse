package com.xworkz.exception.event.theatre;

import com.xworkz.exception.runtime.HouseFullRunTimeException;

public class Theatre {

	private final int gandhiClassTicket = 5;
	private final int middleClassTicket = 5;
	private final int balconyTicket = 2;
	private String movieName;

	public Theatre(String movieName){
		this.movieName=movieName;
	}

	public boolean bookTicket(String movieName,TicketType ticketType,int totalTickets)
	{
		System.out.println("invoked bookTicket");
        if(movieName.equals(movieName))
		{
			if(TicketType.GANDHI_CLASS.equals(ticketType) && totalTickets <= this.gandhiClassTicket)
			{
				System.out.println(this.movieName.concat(" is booked with ").concat(ticketType.toString()));
				return true;
			}else
			{
				System.err.println("Cannot book ticket for ".concat(movieName).concat(" ticket is full for ").concat(ticketType.toString()));
				throw new HouseFullRunTimeException("Gandhi class can have max 5 tickets only");
			}
		}
		return false;
	}

	public boolean bookTicket1(String movieName,TicketType ticketType,int totalTickets)
	{
		System.out.println("invoked bookTicket");
        if(movieName.equals(movieName))
		{
			if(TicketType.MIDDLE_CLASS.equals(ticketType) && totalTickets<=this.middleClassTicket)
			{
				System.out.println(this.movieName.concat(" is booked with ").concat(ticketType.toString()));
				return true;
			}else
			{
				System.err.println("Cannot book ticket for ".concat(movieName).concat(" ticket is full for ").concat(ticketType.toString()));
				throw new HouseFullRunTimeException("Middle class can have max 5 tickets only");
			}
		}
		return false;
	}
	
	public boolean bookTicket2(String movieName,TicketType ticketType,int totalTickets)
	{
		System.out.println("invoked bookTicket");
        if(movieName.equals(movieName))
		{
			if(TicketType.BALCONY.equals(ticketType) && totalTickets<=this.balconyTicket)
			{
				System.out.println(this.movieName.concat(" is booked with ").concat(ticketType.toString()));
				return true;
			}else
			{
				System.err.println("Cannot book ticket for ".concat(movieName).concat(" ticket is full for ").concat(ticketType.toString()));
				throw new HouseFullRunTimeException("Balcony class can have max 2 tickets only");
			}
		}
		return false;
	}


}
