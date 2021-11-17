package conm.xworkz.shoe.starter;

import com.xworkz.shoe.parent.Shoe;

public class ShoeStarter {

	public static void main(String[] args) 
	{
		Shoe shoe = new Shoe();
		shoe.setBrand("Nike");
		shoe.setColour("Black");
		shoe.setGender("male");
		shoe.setSize(8);

		Shoe shoe1 = new Shoe();
		shoe1.setBrand("Nike");
		shoe1.setColour("Black");
		shoe1.setGender("female");
		shoe1.setSize(6);

		if (shoe == shoe1)
		{
			System.out.println("both are pointing to same memory location");
		}
		
		boolean same = shoe.equals(shoe1);
		System.out.println(same);

	}

}
