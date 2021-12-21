package com.xworkz.iterator.mall;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class AirQualityIndexStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> airQualityIndex = Stream.of(121,287,342,245,657,457,15,57,344,123,456,278,234,98,77,12,8,156,100,35);

		List<Integer> tempCollect = airQualityIndex.filter((e)->e<100).sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList());
	
		System.out.println(tempCollect);
	}

}
