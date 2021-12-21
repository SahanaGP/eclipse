package com.xworkz.iterator.mall;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CerealsStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double size1=1.5;
		double size2=2.0;
		double size3=4.0;
		double size4=5.5;
		double size5=2.5;
		double size6=7.0;
		double size7=3.5;
		double size8=5d;
		double size9=5.8;
		double size10=2.9;
		
		Stream<Double> cerealSize = Stream.of(size1,size2,size3,size4,size5,size6,size7,size8,size9,size10,
				2.7,7.8,4.5,6.7,3.8,8.9,9d,11d,5.8,4.8);
		
        List<Double> tempCollect = cerealSize.filter((e)->e>4).collect(Collectors.toList());
		
		System.out.println(tempCollect);
		
	}

}
