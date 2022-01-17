package com.learn;

public class MPS {
	protected double exceedsSpendingLimit;
	protected double spending;
	protected Constituency constituency;
	protected Driver driver;
	public MPS(double spending, Constituency constituency, Driver driver)
	{
		exceedsSpendingLimit=100000;
		this.spending=spending;
		this.constituency=constituency;
		this.driver=driver;
	}
	public Constituency getConstituency()
	{
		return constituency;
	}
	public Driver getDriver()
	{
		return driver;
	}
	public boolean exceedsSpendingLimit()
	{
		return (spending > exceedsSpendingLimit) ? true : false;
	}
	public void drivingCar()
	{
		System.out.println("driving Car.");
	}
}
