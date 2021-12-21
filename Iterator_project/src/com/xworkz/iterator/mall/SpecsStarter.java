package com.xworkz.iterator.mall;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpecsStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> specsNames = Stream.of("Crazy specs","Fossil","Valerie Spencer","Burberry","Salvador","Delite optical","IDEE",
				"Titan Eye Plus","Titan Spectacles","GKB Spectacles","Fastrack Spectacles","Ray-Ban Spectacles","Tag Heuer Spectacles",
				"Dolce And Gabbana","Versace","Prada","Calvin Klein","Gucci","Taggy","ELEGANTE");
		
        List<String> tempCollect = specsNames.map(String::toUpperCase).collect(Collectors.toList());
		
		tempCollect.forEach(e->System.out.println(e));
			
		
		// List<String> tempCollect1 = specsNames.map(String::toLowerCase).collect(Collectors.toList());
			
			//System.out.println(tempCollect1);
					
	}

}
