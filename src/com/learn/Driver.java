package com.learn;

public class Driver {
	private String name;
	private String vehicleLicense;
	public Driver(String name, String vehicleLicense) {
		super();
		this.name = name;
		this.vehicleLicense = vehicleLicense;
	}
	public Driver() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVehicleLicense() {
		return vehicleLicense;
	}
	public void setVehicleLicense(String vehicleLicense) {
		this.vehicleLicense = vehicleLicense;
	}
	
}
