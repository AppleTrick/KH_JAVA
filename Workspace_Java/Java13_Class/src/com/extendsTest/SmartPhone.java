package com.extendsTest;

public class SmartPhone extends Phone{
	
	public SmartPhone(String name, String Pnum) {
		super(name, Pnum);
	}
	
	public void internet() {
		System.out.println("인터넷을 사용하는 기능");
	}
}
