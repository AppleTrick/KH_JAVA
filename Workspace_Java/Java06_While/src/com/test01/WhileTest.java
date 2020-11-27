package com.test01;

public class WhileTest {
	public static void main(String[] args) {
		// 1. 1 ~ 100 까지의 숫자를 역순으로 출력하자
		 test01();
		// 2. 1 ~ 100 까지의 숫자 중 2 의 배수만 출력하자
		 test02();
		// 3. 1 ~ 100 까지의 숫자 중, 7 의 배수와 갯수와 7 의 배수의 총합을 출력하자
		 test03();
	}

	public static void test01() {
		int i = 100;
		while ( i > 0) {
			System.out.println(i);
			i--;
		}
	}
	public static void test02() {
		int j = 1;
		while(j <= 100) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j ++;
		}
	}
	public static void test03() {
		int z = 1;
		int sum = 0;
		int count = 0;
		while (z <= 100) {
			if (z % 7 == 0) {
				sum += z;
				count++;
			}
			z++;
		}
		System.out.println(" 7의 배수의 갯수 : " + count);
		System.out.println(" 7의 배수의 총 합 : " + sum);

	}
}
