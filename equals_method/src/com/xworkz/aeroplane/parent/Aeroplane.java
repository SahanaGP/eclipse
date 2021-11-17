package com.xworkz.aeroplane.parent;

public class Aeroplane {

	private int no;
	private String company;
	private String govt;

	@Override
	public boolean equals(Object obj) 
	{
		System.out.println("invoking equals from Aeroplane");
		if (obj != null) 
		{
			System.out.println("reference is not null");
			if (obj instanceof Aeroplane)
			{
				System.out.println("reference is Aeroplane");
				Aeroplane casted = (Aeroplane) obj;
				String castedGovt = casted.getGovt();
				int castedNo = casted.getNo();
				if (this.govt.equals(castedGovt) && this.no == castedNo)
				{
					System.out.println("govt and no are matching");
					return true;
				} else {
					System.err.println("govt and no are not matching");
				}
			} else {
				System.err.println("I cannot compare,reference is not Aeroplane");
			}
		} else {
			System.err.println("reference is null,pass proper ref!!!!");
		}
		return false;

	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getGovt() {
		return govt;
	}

	public void setGovt(String govt) {
		this.govt = govt;
	}

}
