package com.test02;

public class Cat extends Animal {
	
	public Cat() {
		// TODO Auto-generated constructor stub
		System.out.println("야옹이 ");
	}
	
	@Override
	public void bark() {
		super.bark();
		System.out.println("야옹");
	}
}
