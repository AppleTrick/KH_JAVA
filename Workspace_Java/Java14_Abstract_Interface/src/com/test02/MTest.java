package com.test02;

import java.util.Scanner;

public class MTest {
	public static void main(String[] args) {

		System.out.println("선택해 주세요 \n[1: 고양이 2:멍멍이 3 :도토]");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();

		Animal animal = null;
		
		
		// 동적 바인딩
		switch (select) {
		case 1:
			animal = new Cat(); 
			break;
		case 2:
			animal = new Dog();
			break;
		case 3:
			animal = new Elephant();
			break;
		}
		
		animal.start();
		animal.stop();
	}
}
