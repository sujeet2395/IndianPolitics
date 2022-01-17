package com.learn;

public class PM extends MPS{

	public PM(double spending, Constituency constituency, Driver driver)
	{
		super(spending, constituency, driver);
		this.exceedsSpendingLimit=10000000;
	}
	public void givePermissionToArrestMinister(Ministers minister)
	{
		minister.setPermission(true);
	}
	public boolean isPermissionGranted(Ministers minister)
	{
		return minister.isPermission();
	}
	public void drivingAircraft()
	{
		System.out.println("driving Aircraft.");
	}	
}
