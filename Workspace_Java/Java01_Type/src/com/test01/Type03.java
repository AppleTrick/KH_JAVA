package com.test01;

public class Type03 {
	public static void main(String[] args) {
		
		// 실수형 타입 : float 4바이트, double 8바이트
		// 실수 타입의 기본은 double
		float f1 = 0.1f;
		float f2 = 9.9F;
		System.out.println(f1);
		System.out.println(f2);
		
		float sumF = f1 + f2;
		System.out.println(sumF + " = " +  f1 + "+" + f2);
		
		System.out.println("--------------------------");
		
		double d1 = 100.04;
		double d2 = 9.06d; // 더블타입도 d 로 표기 가능
		double sumD = d1 +d2;
		System.out.println(sumD);
	}

}
