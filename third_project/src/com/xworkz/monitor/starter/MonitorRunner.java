package com.xworkz.monitor.starter;

import com.xworkz.monitor.Monitor;

public class MonitorRunner {

public static void main(String[] args)
	
	{
		Monitor monit=new Monitor();
		
		monit.add("HP");
		monit.add(null);
		monit.displayBrandNames();
		monit.add("Dell");
		monit.add("Lenovo");
		monit.add("Macbook Pro");
		monit.add("Acer");
		monit.add("Asus");
		monit.add("LG");
		monit.add("Samsung");
		monit.displayBrandNames();
	}
}
