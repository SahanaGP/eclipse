package com.xworkz.iterator.mall;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SatellitesStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> satelliteNames = Stream.of("Aryabhatta","Bhaskara Sega-I","Rohini TechnologyPayload","Rohini RS-1",
				"Rohini RS-D1","Apple","Bhaskara-II","INSAT-1A","Rohini RS-D2","INSAT-1B","SROSS-1","IRS-1A","SROSS-2",
				"INSAT-1C","INSAT-1D","IRS-1B","INSAT-2DT","SROSS-C","INSAT-2A","INSAT-2B");
	 
		List<String> tempCollect = satelliteNames.sorted().collect(Collectors.toList());//ascending order
		
		System.out.println(tempCollect);
		
		System.out.println("-------------------------------------------");
	
		//descending order
		
        //List<String> tempCollectDesc = satelliteNames.sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList());
		
		//System.out.println(tempCollectDesc);
	
	}

}
