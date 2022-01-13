package com.learn;

public class MPS {
	private double exceedsSpendingLimit;
	private double spending;
	private String constituency;
	private String driver;
	public MPS(double spending, String constituency, String driver)
	{
		exceedsSpendingLimit=100000;
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
	public void mpsCanBeArrested()
	{
		if(spending > exceedsSpendingLimit)
		{
			System.out.println("MPS can be arrested.");
		}else {
			System.out.println("MPS cannot be arrested.");
		}
	}
	public void drivingCar()
	{
		System.out.println("driving Car.");
	}
}
