package com.vehicle;

public class SportsCar extends Car {
	
	public SportsCar() {
		super();
	}
	public SportsCar(String color) {
		super(color);
		System.out.println(color + " 스포츠카 생성");
	}
	public SportsCar(String color, int speed) {
		super(color, speed);
	}
	@Override
	public void accelPedal() {
		System.out.println("속도가 20 올라갑니다");
		setSpeed(getSpeed() + 20);
	}
	@Override
	public void breakPedal() {
		setSpeed(getSpeed() - 20);
		if (getSpeed() > 0) {
			System.out.println("속도가 20 줄어듭니다.");
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
