package com.test04;

public class Eagle extends Animal implements Bird {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("파닭 파닭");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("독수리가 어떻게 울지?");
	}	

}
