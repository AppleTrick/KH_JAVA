package com.test02;

import java.util.Random;

public class RandomTest01 {
	
	public static void main(String[] args) {
		useMathClass();
		useRandomClass();
	}
	
	
	//java.util.Random
	public static void useRandomClass() {
		// TODO Auto-generated method stub
		Random rd = new Random();
		System.out.println(rd.nextInt(100));
	}

	//java.lang.math 함수 사용
	public static void useMathClass() {
		// TODO Auto-generated method stub
		
		double ran = Math.random();
		System.out.println(ran);
		
		int min = 0;
		int max = 10;
		/*
		 * (int)(Math.random() * (max - min + 1 )) + min
		 * min ~ max (max 포함)
		 * 
		 * (Math.random() * 범위최대값 + 범위최소값) + 0보다 클경우
		 */
		int rd = (int)	(Math.random() *(max - min + 1 ) ) 	+ min;
		System.out.println("random : " + rd);
	}
}
