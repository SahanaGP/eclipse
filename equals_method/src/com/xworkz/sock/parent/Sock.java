package com.xworkz.sock.parent;

public class Sock {

	private char size;
	private double price;
	private SockMaterial material;
	private SockType type;

	@Override
	public boolean equals(Object obj) 
	{
		System.out.println("invoking equals from sock");
		if (obj != null) 
		{
			System.out.println("reference is not null");
			if (obj instanceof Sock)
			{
				System.out.println("refrence is Sock");
				Sock casted = (Sock) obj;
				char castedsize = casted.getSize();
				SockMaterial castedMaterial = casted.getMaterial();
				if (this.material.equals(castedMaterial) && this.size == castedsize) 
				{
					System.out.println("size and material are matching");
					return true;
				} else 
				{
					System.err.println("size and material are not matching");
				}
			} else
			{
				System.err.println("I cannot compare,refrence is not sock");
			}
		} else {
			System.err.println("reference is null,pass proper ref!!!!");
		}
		return false;

	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public SockMaterial getMaterial() {
		return material;
	}

	public void setMaterial(SockMaterial material) {
		this.material = material;
	}

	public SockType getType() {
		return type;
	}

	public void setType(SockType type) {
		this.type = type;
	}

}
