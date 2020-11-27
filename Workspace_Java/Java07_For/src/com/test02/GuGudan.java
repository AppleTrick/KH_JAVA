package com.test02;

public class GuGudan {
	public static void main(String[] args) {
		
		// 1,  2 단 부터 9 단까지 전체 출력
		// while 문 사용 금지 for 문 사용
		//gugu01();
		
		System.out.println(" -------------------");
		
		//2 . 아규먼트로 들어온 값의 단만 출력
		//gugu02(5);
		
		guguWhile01();
		guguWhile02(5);
	}
	
	public static void gugu01() {
		for (int i = 2; i <10; i++) {
			System.out.println("<"+i+">단");
			for (int j = 1; j < 10; j++) {
				System.out.println( i  + " * " + j  +  " = " +(i*j) );
			}
			System.out.println();
		}
	}
	
	
	public static void gugu02(int i) {
		System.out.println("<"+i+">단");
		for (int j = 1; j < 10; j++) {
			System.out.println( i  + " * " + j  +  " = " +(i*j) );
		}
	}
	
	public static void guguWhile01() {
		int i = 2;
		while( i < 10 ) {
			System.out.println("<"+i+">단");
			int j = 1;
			while (j < 10) {
				System.out.println( i  + " * " + j  +  " = " +(i*j) );
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
    public static void guguWhile02( int dan) {
    	int j = 1;
		while (j < 10) {
			System.out.println( dan  + " * " + j  +  " = " +(dan*j) );
			j++;
		}
	}
}
