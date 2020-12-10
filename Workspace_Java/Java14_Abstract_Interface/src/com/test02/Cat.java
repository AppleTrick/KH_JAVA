package com.test02;

public class Cat extends Animal {
	
	public Cat() {
		// super() 가 실행되고 있음
		System.out.println(" 고양이");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("고양이가 사뿐 사뿐 걷는다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("고양이가 멈췄다.");
	}

}
