package com.learn;

import java.util.Objects;

public class Commissioner {
	private MPS mps;
	private PM pm;
	public Commissioner()
	{
		
	}
	public Commissioner(MPS mps)
	{
		this.mps=mps;
	}
	public Commissioner(MPS mps, PM pm)
	{
		this.mps=mps;
		this.pm=pm;
	}
	
	public PM getPm() {
		return pm;
	}
	public void setPm(PM pm) {
		this.pm = pm;
	}
	public boolean canArrest() {
		if(Objects.nonNull(mps) && Objects.isNull(pm))
			return mps.exceedsSpendingLimit();
		else if(Objects.isNull(mps) && Objects.nonNull(pm))
			return pm.exceedsSpendingLimit();
		else if(Objects.nonNull(mps) && mps instanceof Ministers && Objects.nonNull(pm) && (isPermissionToArrest()||mps.exceedsSpendingLimit()))
			return true;
		else
			return mps.exceedsSpendingLimit();
	}
	private boolean isPermissionToArrest() {
		
		return pm.isPermissionGranted((Ministers)mps);
	}
	public MPS getMps() {
		return mps;
	}
	public void setMps(MPS mps) {
		this.mps = mps;
	}
	
}
