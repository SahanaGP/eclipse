package com.xworkz.sock.starter;

import com.xworkz.sock.parent.Sock;
import com.xworkz.sock.parent.SockMaterial;
import com.xworkz.sock.parent.SockType;

public class SockStarter {

	public static void main(String[] args) {
		Sock sock = new Sock();
		sock.setMaterial(SockMaterial.COTTON);
		sock.setPrice(100);
		sock.setSize('s');
		sock.setType(SockType.KNEE_HIGH);

		Sock sock1 = new Sock();
		sock1.setMaterial(SockMaterial.COTTON);
		sock1.setPrice(80);
		sock1.setSize('s');
		sock1.setType(SockType.QUARTER);

		if (sock == sock1)
		{
			System.out.println("both are pointing to same memory location");
		}
		
		boolean same = sock.equals(sock1);
		System.out.println(same);

	}

}

