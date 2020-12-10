package com.extendsTest;

public class Phone {
	String name;
	String Pnum;
	
	public Phone(String name , String Pnum) {
		this.name = name;
		this.Pnum = Pnum;
	}

	public void call() {
		System.out.println(name +"가 전화를 거는 기능 핸드폰 번호 : " + Pnum);
	}
	
	public void sendMessage() {
		System.out.println(name + "가 문자를 보냅니다");
	}
}
