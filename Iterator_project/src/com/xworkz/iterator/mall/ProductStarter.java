package com.xworkz.iterator.mall;

public class ProductStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductDAO daoo=new ProductDAO();
		ProductDTO dto1=new ProductDTO("Fan",30,4500.0f,"Havells");
		
	ProductDTO match=daoo.find((a,b)->
	{
	if(a.getName().equals(b.getName())&&a.getPrice()==(b.getPrice()))
	{
		return a;
	}
	return null;
	},dto1);
	
	System.out.println(match);
		

	}

}
		
	