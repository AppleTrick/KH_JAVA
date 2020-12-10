package com.test02;

public class Elephant extends Animal {
	
	public Elephant() {
		// TODO Auto-generated constructor stub
		System.out.println(" 코끼리 ");
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("도토가 쿵쿵 걷는다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("도토가 멈췄다.");
	}

}
