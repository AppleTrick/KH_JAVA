package com.test01;

public class MTest {

	public static void main(String[] args) {
		// prn01();
		//prn02();
		prn03();

	}

	public static void prn01() {
		// 초기값
		int i = 10;

		// 조건식
		while (i < 10) {
			System.out.println(i);

			// 증감식
			i++;
		}

		System.out.println("while 이 종료된 이후로의  i : " + i);
	}

	public static void prn02() {
		int i = 10;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);

		System.out.println("while 이 끝난 후의  i : " + i);
	}
	
	public static void prn03() {
		int i = 1;
		while(true) {
			System.out.println(i);
			i ++;
			
			// 무한루프에서는 종료를 시켜주는 방법을 만들어주는게 잘짜는 코드
			if (i == 10) {
				break;
			}
		}
	}

}
