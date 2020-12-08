package com.test03;

public class MySum {
	
	// overloading 오버로딩 -> 이름이 같은 메소드에서 매개변수의 갯수를 다르게 받아 정의 한 메소드
	// override 오버라이딩 -> 동일 메소드를 재 정의한것
	
	public int sum(int i) {
		return i + i;
	}
	
	public int sum (int i, int j ) {
		return i + j;
	}
	
	public int sum (int i, int j , int k ) {
		return i + j + k;
	}
	
	public double sum (double d , double f) {
		return d + f;
	}
	
	public int sum (double d1, double d2, double d3) {
		return (int) (d1 + d2 + d3);
	}
}
