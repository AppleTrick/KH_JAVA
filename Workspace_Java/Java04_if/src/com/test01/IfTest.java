package com.test01;

public class IfTest {

	public static void main(String[] args) {
		// 1. 입력 받은 수가 5 의 배수 이면 " 5의 배수 입니다 " 를 출ㄹ력
		test01(10);
		
		// 2. 입력받은 수가 2 의 배수이면서 3의 배수이면 . " 2와 3의 배수 입니다를 " 를 출력
		//  아니라면 "2, 와 3의 배수가 아닙니다"를 출력
		test02(7);
		
		// 3. 입력받은 문자형의 값 하나가 소문자라면 "소문자 입니다"
		// 대문자라면 " 대분자 입니다 출력
		test03('c');
	}

	public static void test01(int i) {
		if (i % 5 == 0) {
			System.out.println(" 5의 배수 입니다 ");
		}
	}

	public static void test02(int i) {
		if ((i % 2 ==0) & (i %3 == 0)) {
			System.out.println("2와 3의 배수 입니다");
		} else {
			System.out.println("2, 와 3의 배수가 아닙니다");
		}
	}
	public static void test03(char c) {
		if (Character.isUpperCase(c) == true) {
			System.out.println("대문자 입니다");
		} else if (Character.isLowerCase(c) == true ) {
			System.out.println("소문자 입니다");
		} else {
			System.out.println("대문자도 소문자도 아닙니다");
		}
		
		String result = (Character.isUpperCase(c)) ? "대문자 입니다 " : "대문자가 아닙니다.";
		System.out.println(result);
	}

}
