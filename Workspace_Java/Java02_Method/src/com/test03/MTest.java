package com.test03;

public class MTest {
	public static void main(String[] args) {
		int mySum = MyCalc.sum(10,2);
		
		System.out.println(mySum);
		
		MyCalc.sub(10, 3);
		
		double myMul = MyCalc.mul(10,3);
		System.out.println(myMul);
		
		//MyCalc.div(10,2)
		
		MyCalc myCalc = new MyCalc();
		myCalc.div(10, 3);
	}
}
