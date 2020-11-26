package com.test03;

public class MyCalc {

	// 접근제한자 , 메모리 영역 , 리턴타입, 메소드명 (파라미터)

	// 더하기
	public static int sum(int i, int j) {
		int result = i + j;
		System.out.println(" i : " + i + "\t j : " + j + "\t\t result : " + result);
		return result;
	}

	// 빼기
	public static void sub(int i, int j) {
		int result = i - j;
		System.out.printf("%d - %d = %d\n", i, j, result);
	}

	// 곱하기
	public static double mul(double i, double j) {
		double result = i * j;
		System.out.printf("%.1f* %.1f = %.1f\n", i, j, result);
		return result;
	}

	// 나누기
	public void div (int i , int j ) {
		// '/'  :  나눈 값;
		int div01 = i / j;
		
		// '%' 나머지 값
		int div02 = i % j;
		
		System.out.printf("%d / %d = %d\n",i,j,div01);
		System.out.printf("%d %% %d = %d\n",i,j,div02);

	}
}