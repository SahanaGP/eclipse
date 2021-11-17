package com.xworkz.newspaper.parent;

public class NewsPaper {

	private String name;
	private String lang;
	private double since;

	@Override
	public boolean equals(Object obj) 
	{
		System.out.println("invoking equals from newspaper");
		if (obj != null)
		{
			System.out.println("reference is not null");
			if (obj instanceof NewsPaper) {
				System.out.println("reference is NewsPaper");
				NewsPaper casted = (NewsPaper) obj;
				String castedName = casted.getName();
				double castedSince = casted.getSince();
				if (this.name.equals(castedName) && this.since == castedSince) 
				{
					System.out.println("name and since are matching");
					return true;
				} else {
					System.err.println("name and since are not matching");
				}
			} else {
				System.err.println("I cannot compare,reference is not NewsPaper");
			}
		} else {
			System.err.println("reference is null,pass proper ref!!!!");
		}
		return false;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public double getSince() {
		return since;
	}

	public void setSince(double since) {
		this.since = since;
	}

}
