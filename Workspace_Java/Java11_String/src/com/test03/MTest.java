package com.test03;

import java.util.StringTokenizer;

public class MTest {
	
	public static void main(String[] args) {
		
		String str = "The String class represents character strings";
		String str02 = "The,String,class,represents,character,strings";
		
		// 1. java.lang.String.subString(begin,end)
		System.out.println(str.substring(4, 10)); // 4부터 시작 10 인덱스 전까지 자른다
		
		// regex (정규식) ->패턴에 따라 다 적용시킴
		//2. java.lang.String.split
		String[] temp = str02.split(",");
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		System.out.println(temp[2]);
		
		System.out.println("===================");
		//3. java.util.StringTokenizer
		StringTokenizer st = new StringTokenizer(str02,",");	// 토큰의 개념으로 분리시킨다 분리시키는 기준은 " , " 이다
		
		while(st.hasMoreTokens()) {	// 남은 토큰이 있는가?
			System.out.println(st.nextToken());
		}
	}
}
