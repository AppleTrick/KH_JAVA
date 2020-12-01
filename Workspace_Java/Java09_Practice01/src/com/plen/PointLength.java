package com.plen;

import java.util.Scanner;

public class PointLength {
	public static void main(String[] args) {
		
		// 원점부터 입력한(x,y) 좌표까지의 거리를 구하자
		Scanner sc = new Scanner(System.in);
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc .nextInt();
		double res = pLength(x,y);
		System.out.printf("(0,0) 부터( %d , %d ) 까지의 거리 는 %.2f 입니다 " , x , y , res);
		
	}
	public static double pLength(int x, int y) {
		
		// Math.pow(a,b) : a^ b
		// Math.sqrt(a) : root(a)
		//Math. hypot(a,b)root(a^2 + b^2);
//		double Pointx =  Math.pow(x, 2);
//		double Pointy =  Math.pow(y, 2);
//		double Meter =  Math.sqrt(Pointx + Pointy);
		double result = Math.hypot(x, y);
		
		
		
		return result;
	}
}
