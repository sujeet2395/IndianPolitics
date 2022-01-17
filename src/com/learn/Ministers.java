package com.learn;

public class Ministers extends MPS{
	
	private boolean isPermission;
	
	public Ministers(double spending, boolean isPermission, Constituency constituency, Driver driver)
	{
		super(spending, constituency, driver);
		this.isPermission=isPermission;
		this.exceedsSpendingLimit=1000000;
	}

	public boolean isPermission() {
		return isPermission;
	}

	public void setPermission(boolean isPermission) {
		this.isPermission = isPermission;
	}
	
}
