package com.xworkz.iterator.mall;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirPortNamesStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stream<String> airPortNames = Stream.of("Kempegowda International Airport","HAL Airport","Jakkur Aerodrome","Belgaum Airport","Bijapur Airport",
				"Bellary Airport","Mangalore International Airport","Mysore Airport","Sirsa Air Force Station","Karwar Airport","Raichur Airport",
				"Shivamogga Airport","Hassan Airport","Hubballi Airport","Yelahanka Air Force Station","Jindal Vijaynagar Airport","Shimla Airport",
				"Surat Airport","Karnal Aerodrome","Shirdi Airport");
		
		List<String> tempCollect = airPortNames.filter((e)->e.startsWith("S")).map(String::toLowerCase).collect(Collectors.toList());
		
		System.out.println(tempCollect);
		
       
		}

}
