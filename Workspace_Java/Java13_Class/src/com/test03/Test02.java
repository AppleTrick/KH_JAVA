package com.test03;

public class Test02 {
	int num = 1;
	
	public Test02(int a) {
		// TODO Auto-generated constructor stub
		num = a;
	}
	
	public Test02(int a, int b) {
		// TODO Auto-generated constructor stub
		num = a +b;
	}
	public Test02(int a, int b , int c) {
		// TODO Auto-generated constructor stub
		num = a +b + c;
	}
	
	public void name(String s) {
		System.out.println(s + num);
		
		num ++;
	}
}
