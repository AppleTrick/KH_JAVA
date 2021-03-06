package com.test01;

public class MTest {
	public static void main(String[] args) {
		prn01();
		prn02(false, false);
	}
	
	public static void prn02(boolean ring, boolean married) {
		if (ring) {
			if (married) {
				System.out.println("결혼을 했군요");
			} else {
				System.out.println("연인이 있으시군요!");
			}
		} else {
			if (married) {
				System.out.println("결혼을 했군요");
			} else {
				System.out.println("솔로이셨군요!");
			}
		}
		
		if(ring && married) {
			System.out.println("결혼하셧군요");
		} else if(ring || married){
			System.out.println("연인이 있으시군요!");
		} else {
			System.out.println("솔로이셧군요");
		}
	}
	
	public static void prn01() {
		int i = 10;
		int j = 20;
		
		// if : 만약 ~ 라면
		if ( i < j) {	// 만일 조건 참이라면
			// block 안에 있는 명령들을 수행
			System.out.println("i 는 j 보다 작습니다");
		}
		
		// if  else 
		if ( i > j) {
			System.out.println("i 는  j  보다 큽니다");
		} else {
			// 위의 조건이 참이 아니라면
			System.out.println("i 는 j  보다 크지 않습니다.");
		}
		
		// if  ~ else if ~   ...  ~ else
		if ( i == 2) {
			System.out.println("i 는 2 입니다");
		} else if ( i == 3) {
			System.out.println("i 는 3 입니다");
		} else if (i == 4) {
			System.out.println( " i 는 4 입니다");
		} else if(i == 5){
			System.out.println( " i 는 5 입니다");
		} else {
			System.out.println("i 는 2 , 3 , 4 , 5  아닙니다");
		}
	}
}
