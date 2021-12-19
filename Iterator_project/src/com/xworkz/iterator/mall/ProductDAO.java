package com.xworkz.iterator.mall;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class ProductDAO {

private Collection<ProductDTO> product=new ArrayList<ProductDTO>();
	

	ProductDTO dto=new ProductDTO("Watch",15,5000.00f,"Fastrack");
	ProductDTO dto1=new ProductDTO("Mobile",57,25000.00f,"One-Plus");
	ProductDTO dto2=new ProductDTO("T.V",15,80000.00f,"Sony");
	ProductDTO dto3=new ProductDTO("UPS",45,20000.00f,"Microtek");
	ProductDTO dto4=new ProductDTO("Laptop",22,42000.00f,"HP");
	ProductDTO dto5=new ProductDTO("Mixer",48,7000.00f,"Prestige");
	ProductDTO dto7=new ProductDTO("Hair Dryer",8,4000.00f,"Philips");
	ProductDTO dto8=new ProductDTO("Fan",30,4500.0f,"Havells");
	ProductDTO dto9=new ProductDTO("Power Bank",70,2000.00f,"MI");
	
	
	public ProductDAO()
	{
	this.product.add(dto);
	this.product.add(dto1);
	this.product.add(dto2);
	this.product.add(dto3);
	this.product.add(dto4);
	this.product.add(dto5);
	this.product.add(new ProductDTO("Straightner",89,4000.99f,"Professionals"));
	this.product.add(dto7);
	this.product.add(dto8);
	this.product.add(dto9);
	
	}
	
	
	public ProductDTO find(DTOMatch search,ProductDTO value)
	{
		
		Iterator<ProductDTO> itr=product.iterator();
		 while(itr.hasNext())
		 {
		ProductDTO element=itr.next();
		if(search.evaluate(element,value) != null)
		{
			return element;
		}
		
		
		 }
		return null;
	}
	
	
}

