package com.extendsTest;

public class MainTest {
	public static void main(String[] args) {
		
		Phone ROKA = new MilitaryPhone("ROKA", "6932");
		MilitaryPhone ROKAF = new MilitaryPhone("ROKAF", "6877");
		Phone person1 = new SmartPhone("아리", "010-0000-0000");
		SmartPhone person2 = new SmartPhone("아칼리", " 010 -1234-5678");
		
		ROKA.call();
		ROKA.sendMessage();
		System.out.println();
		
		ROKAF.call();
		ROKAF.sendMessage();
		System.out.println();
		
		person1.call();
		person1.sendMessage();
		System.out.println();
		// saram.internet();
		// Phone 형식으로 되엇기 때문에 사용 불가능 internet 은 사용 불가능
		
		person2.call();
		person2.sendMessage();
		person2.internet();
	}
}
