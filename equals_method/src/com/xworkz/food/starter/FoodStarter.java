package com.xworkz.food.starter;

import com.xworkz.food.parent.Food;

public class FoodStarter {

	public static void main(String[] args) {
		Food food = new Food();
		food.setName("Chicken Biriyani");
		food.setPrice(200);
		food.setQuality(true);
		food.setQuantity(2.00f);

		Food food1 = new Food();
		food1.setName("Chicken Biriyani");
		food1.setPrice(400);
		food1.setQuality(true);
		food1.setQuantity(3.00f);

		if (food == food1)
		{
			System.out.println("both are pointing to same memory location");
		}
		
		boolean same = food.equals(food1);
		System.out.println(same);

	}

}
