package com.compare;

import java.util.Arrays;

public class MTest01 {
	
	public static void main(String[] args) {
		Score[] kh = new Score[3];
		kh[0] = new Score("강호동",90,89,100);
		kh[1] = new Score("민호",55,100,68);
		kh[2] = new Score("피오",100,40,80);
	
		for (Score student : kh) {
			System.out.println(student);
		}
		
		Arrays.sort(kh);	//compare.Score cannot be cast to class java.lang.Comparable
		System.out.println("===================");
		for (Score student : kh) {
			System.out.println(student);
		}
	}
}
