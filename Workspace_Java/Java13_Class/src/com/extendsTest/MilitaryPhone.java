package com.extendsTest;

public class MilitaryPhone extends Phone {

	public MilitaryPhone(String name, String Pnum) {
		super(name, Pnum);
	}
	
	@Override
	public void call() {
		System.out.println(name + "에서 보안 기능을 추가한 보안폰");
	}
	
}
