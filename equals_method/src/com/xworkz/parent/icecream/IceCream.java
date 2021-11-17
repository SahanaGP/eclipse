package com.xworkz.parent.icecream;

public class IceCream {

	private FlavourTypes flavour;
	private String name;
	private IceCreamType type;

	@Override
	public boolean equals(Object obj)
	{
		System.out.println("invoking equals from IceCream");
		if (obj != null) 
		{
			System.out.println("reference is not null");
			if (obj instanceof IceCream)
			{
				System.out.println("reference is IceCream");
				IceCream casted = (IceCream) obj;
				FlavourTypes castedFlavour = casted.getFlavour();
				String castedName = casted.getName();
				if (this.flavour.equals(castedFlavour) && this.name.equals(castedName)) {
					System.out.println("flavour and name are matching");
					return true;
				} else 
				{
					System.err.println("flavour and name are not matching");
				}
			} else 
			{
				System.err.println("I cannot compare,reference is not IceCream");
			}
		} else
		{
			System.err.println("reference is null,pass proper ref!!!!");
		}
		return false;

	}

	public FlavourTypes getFlavour() {
		return flavour;
	}

	public void setFlavour(FlavourTypes flavour) {
		this.flavour = flavour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IceCreamType getType() {
		return type;
	}

	public void setType(IceCreamType type) {
		this.type = type;
	}

}

