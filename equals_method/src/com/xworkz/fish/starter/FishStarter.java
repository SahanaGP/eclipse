package com.xworkz.fish.starter;

import com.xworkz.fish.parent.Fish;
import com.xworkz.fish.parent.FishType;

public class FishStarter {

	public static void main(String[] args) {
		Fish fish = new Fish();
		fish.setName("mud cat");
		fish.setColour("Gray");
		fish.setType(FishType.CATFISH);
		fish.setPrice(400);
		
        Fish fish1 = new Fish();
        fish1.setName("mud cat");
		fish1.setColour("Gray");
		fish1.setType(FishType.RAINBOW_TROUT);
		fish1.setPrice(300);

		if (fish == fish1)
		{
			System.out.println("both are pointing to same memory location");
		}
		
		boolean same = fish.equals(fish1);
		System.out.println(same);
	}

}
