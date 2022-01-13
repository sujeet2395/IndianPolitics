package com.learn;

public class PM {
	private double exceedsSpendingLimit;
	private double spending;
	private String constituency;
	private String driver;
	public PM(double spending, String constituency, String driver)
	{
		exceedsSpendingLimit=10000000;
		this.spending=spending;
		this.constituency=constituency;
		this.driver=driver;
	}
	public String getConstituency()
	{
		return constituency;
	}
	public String getDriver()
	{
		return driver;
	}
	public boolean exceedsSpendingLimit()
	{
		if(spending > exceedsSpendingLimit)
		{
			return true;
		}
		return false;
	}
	public void pmCanBeArrested()
	{
		if(spending > exceedsSpendingLimit)
		{
			System.out.println("PM can be arrested.");
		}else {
			System.out.println("PM cannot be arrested.");
		}
	}
	public void drivingAircraft()
	{
		System.out.println("driving Aircraft.");
	}
	public void drivingCar()
	{
		System.out.println("driving Car.");
	}
}
