package com.test04;

public class Dog extends Animal {

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	
	}
	@Override
	public void eat(String feed) {
		System.out.println("멍멍이가 " + feed + " 먹는다.");
	}

}
