package com.learn;

public class Commissioner {
	public static void main(String[] args) {
		PM pm=new PM(10000001,"varnashi", "raj");
		pm.pmCanBeArrested();
		Ministers minister=new Ministers(1000000, true, "lackhnow","raj");
		minister.ministerCanBeArrested();
		MPS mps=new MPS(100000,"Unaav","Mahesh");
		mps.mpsCanBeArrested();
	}
}
