package com.test01;

import java.util.Vector;

public class MTest01 {
	public static void main(String[] args) {
		
		// Vector​(int initialCapacity, int capacityIncrement) 
		// iCa 만큼 용량을 만든다 (미리 만들어진 사이즈 크기) , iCa 만큼 넘어가면 cpIn 만큼 용량 증가 
		//제거 했을경우 용량은 줄어들지 않음
		
		Vector<Integer> v = new Vector<Integer>(10,5);
		System.out.println(v.size() + " : "  + v.capacity());
		
		for (int i = 0; i < 9; i++) {
			v.add(i);
			System.out.println( v  + " -> " + v.size() + " : " + v.capacity());
		}
		
		v.add(9);
		System.out.println( v  + " -> " + v.size() + " : " + v.capacity());
		
		v.add(10);
		System.out.println( v  + " -> " + v.size() + " : " + v.capacity());
		v.remove(0);
		System.out.println( v  + " -> " + v.size() + " : " + v.capacity());
		
	}
}
