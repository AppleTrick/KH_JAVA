package com.vehicle;

public class Truck extends Car {
	
	
	public Truck() {
		super();
	}

	public Truck(String color, int speed) {
		super(color, speed);
	}

	public Truck(String color) {
		System.out.println(color + " 트럭 생성");
	}
	@Override
	public void accelPedal() {
		System.out.println("속도가 15 올라갑니다");
		setSpeed(getSpeed() + 15); 
	}
	@Override
	public void breakPedal() {
		setSpeed(getSpeed() - 15);
		if (getSpeed() > 0) {
			System.out.println("속도가 15 줄어듭니다.");
		} else {
			System.out.println("멈췄습니다.");
			setSpeed(0);
		}
	}
	@Override
	public String toString() {
		return "현재 속도는 " + getSpeed()  + " 입니다 ";
	}
	
}
