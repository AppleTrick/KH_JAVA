package com.singleton;

public class MTest {

	public static void main(String[] args) {
		
		//Singleton singleton = new Singleton();	// 접근제한자 private로 인한 new 선언 불가
		
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println();
		System.out.println(s1.hashCode());
		System.out.println("==========");
		
		Singleton s2 = Singleton.getInstance();
		System.err.println(s2);
		System.out.println();
		System.out.println(s2.hashCode());
	}
}
