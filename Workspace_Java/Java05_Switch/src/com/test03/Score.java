package com.test03;

public class Score {
	
	/*
	 * int 형 값 3 개를 받아서 3으로 나눠서 평균값을 리턴하는 getAvg 라는 메소드 만들자
	 * 접근은 어디서 가능하며, non-static으로 만들자
	 */
	
	public double getAvg(int a , int b, int c) {
		double avg= (double)(a + b + c) / 3;
		return avg;
	}
	 /*
	  * double 형 평균값 하나를 받아서 
	  * 값이 90 ~ 100 사이면 a
	  * 80 ~ 89 사이 면 b
	  * 70 ~ 79 사이 면 c
	  * 60 ~ 69 사이 면 d
	  *  ~ 59 면 "f" 를 리턴하는 getGrade 메소드를 만들자
	  *  어디서나 접근 가능하면 non static으로 만들자
	  *  그리고 기능은 switch 으로 만들자 if 사용 금지
	  */
	public String getGrade(double thisAvg) {
		String result;
		switch ((int)thisAvg/10) {
		case 10:
		case 9:
			result = "a";
			break;
		case 8:
			result = "b";
			break;
		case 7:
			result = "c";
			break;
		case 6:
			result = "d";
			break;
		default: 
			result = "f";
			break;
		}
		
		
		return result;
	}
	/*
	 * 3. MTest의 메인 메소드에서  getAvg 와 getGrade  를 사용하여 홍길동과 이순신의 등급을 출력하자
	 */

}
