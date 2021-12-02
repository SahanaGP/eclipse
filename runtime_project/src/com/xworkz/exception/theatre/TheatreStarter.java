package com.xworkz.exception.theatre;

import com.xworkz.exception.event.theatre.Theatre;
import com.xworkz.exception.event.theatre.TicketType;

public class TheatreStarter {

	public static void main(String[] args) {


		Theatre theatre=new Theatre("Mugilupete");

		theatre.bookTicket("Mugilupete",TicketType.GANDHI_CLASS, 5);
        theatre.bookTicket1("Mugilupete", TicketType.MIDDLE_CLASS, 5);
        theatre.bookTicket2("Mugilupete", TicketType.BALCONY, 2);
        System.out.println("no logical issue");

	}

}

