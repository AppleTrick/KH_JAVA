package com.test01;

public class MTest {
	public static void main(String[] args) {
		prn01();
		prn02();
	}
	public static void prn02() {
		int i = 2;
		switch ( i ) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 9 :
			System.out.println("홀수 입니다.");
			break;
		case 2: case 4: case 6: case 8: case 10:
			System.out.println("짝 수입니다.");
			break;
		}
	}
	
	public static void prn01() {
		int i = 2;
		
		/*
		 * if 는 가장 위의 조건 부터 순차적으로 모든 코드를 읽지만
		 * switch 는 해당 식/ 값에 맞는  case 로  jumping 한다 => 컴파일러가 작업하기 수월하다. 
		 * fall through
		 * 
		 * 
		 * break 를 만나면 해당 블록 밖으로 나가라 라는 의미
		 */
		
		switch (i) {
		case 1:
			System.out.println("1 입니다");
			break;
		case 2:
			System.out.println("2 입니다");
			break;
		case 3:
			System.out.println("3 입니다");
			break;
		default :
			System.out.println("1,2,3 이 아닙니다");
		}
	}
}
