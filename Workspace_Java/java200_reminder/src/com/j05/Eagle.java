package com.j05;

public class Eagle extends Animal {
	
	String bark1 = "도오오오옥수리";

	public Eagle(String kind, int age) {
		super(kind, age);
	}
	
	public void bark() {
		super.bark(bark1);
	}
}
