package com.test02;

public class TypeToType03 {
	public static void main(String[] args) {
		//wrapper class
		
		//boxing
		Integer i = Integer.valueOf(100);
		System.out.println(i);
		System.out.println(i.doubleValue());
		
		
		//unBoxing
		//명시적
		
		int j = i.intValue();
		System.out.println(j);
		
		//묵시적
		int k = i;
		System.out.println(k);
	}
}
