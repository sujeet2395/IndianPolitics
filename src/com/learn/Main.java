package com.learn;

public class Main {
	public static void main(String[] args) {
		Commissioner commissioner = new Commissioner();
		PM pm=new PM(10000000,new Constituency("varnashi"), new Driver("raj","car"));
		commissioner.setPm(pm);
		System.out.println(commissioner.canArrest());
		Ministers minister=new Ministers(1000001, false, new Constituency("lackhnow"), new Driver("raj","car"));
		commissioner.setMps(minister);
		System.out.println(commissioner.canArrest());
		pm.givePermissionToArrestMinister(minister);
		System.out.println(commissioner.canArrest());
		
		MPS mps=new MPS(100001, new Constituency("Unnav"), new Driver("raj","car"));
		commissioner.setMps(mps);
		commissioner.setPm(null);
		System.out.println(commissioner.canArrest());
	}
}
