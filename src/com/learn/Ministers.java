package com.learn;

public class Ministers {
	private double exceedsSpendingLimit;
	private double spending;
	private boolean isPermission;
	private String constituency;
	private String driver;
	public Ministers(double spending, boolean isPermission, String constituency, String driver)
	{
		exceedsSpendingLimit=1000000;
		this.spending=spending;
		this.isPermission=isPermission;
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
	public void ministerCanBeArrested()
	{
		if(spending > exceedsSpendingLimit || isPermission)
		{
			System.out.println("Minister can be arrested.");
		}else {
			System.out.println("Minister cannot be arrested.");
		}
	}
	public void drivingCar()
	{
		System.out.println("driving Car.");
	}
}
