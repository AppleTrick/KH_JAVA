package com.test01;

public class MTest {
	public static void main(String[] args) {
		
		ExceptionCal ec = new ExceptionCal();
		
		System.out.println(ec.calculation());
		// 10 , 0 -> Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		// a -> Exception in thread "main" java.util.InputMismatchException
	}
}
