package com.test03;

public class MTest {
	public static void main(String[] args) {
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 40;
		int math1 = 78;
		
		Score hong = new Score();
		double avg1 = hong.getAvg(kor1, eng1, math1);
		String hongGrade = hong.getGrade(avg1);
	
		System.out.printf("%s의  등급은 %s 입니다" , name1 , hongGrade);
		
		System.out.println();
		
		String name2 = "이순신";
		int kor2 = 89;
		int eng2 = 77;
		int math2 = 100;
		
		Score lee = new Score();
		double avg2 = hong.getAvg(kor2, eng2, math2);
		String leeGrade = lee.getGrade(avg2);
		
		System.out.printf("%s의  등급은 %s 입니다" , name2 , leeGrade);
	}
}
