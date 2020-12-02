package com.test01;

import java.util.Arrays;

public class MTest03 {
	/*
	 * 1)
	 * a b c d e f
	 * g h i j k l
	 * m n o p q r
	 * s t u v w x
	 * y z 
	 * 출력
	 * 단 , 일차원 배열 char[] 에 반복문을 사용하여 알파뱃을 저장한 후에 출력하자.
	 *  
	 */
	
	
	// 2) 1번에서  만든 배열을 거꾸로 출력하자
	
	
	// 3) 1 번에서 만든 배열을 거꾸로 출력하자
	public static void main(String[] args) {
		char[] arr = new char[26];
		prn01(arr);
		System.out.println();
		System.out.println();
		prn02(arr);
		System.out.println();
		System.out.println();
		prn03(arr);
	}
	public static void prn01(char[] arr) {
//		char Alpabet = 'a';
//		int count = 1;
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = Alpabet;
//			System.out.printf("%c \t ", Alpabet);
//			if (count == 6) {
//				System.out.println();
//				count = 0;
//			}
//			Alpabet++;
//			count ++;
//		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char)('a' + i);
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i-1] + " ");
			if ( i% 6 == 0) {
				System.out.println();
			}
		}
	}
	public static void prn02(char[] arr) {
//		char Alpabet = 'z';
//		int count = 1;
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = Alpabet;
//			System.out.printf("%c \t ", Alpabet);
//			if (count == 6) {
//				System.out.println();
//				count = 0;
//			}
//			Alpabet--;
//			count ++;
//		}
		int tmp = 1;
		for (int i = arr.length; i > 0; i--) {
			System.out.printf("%s " , arr[i-1]);
			if (tmp % 6 == 0) {
				System.out.println();
			}
			tmp ++;
		}
	}
	public static void prn03(char[] arr) {
		Character Alpabet = 'a';
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Alpabet;
			System.out.print(Character.toUpperCase(arr[i]) + "\t");
			if (count == 6) {
				System.out.println();
				count = 0;
			}
			Alpabet++;
			count ++;
		}
		
		System.out.println();
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Character.toUpperCase(arr[i]);
			System.out.printf("%s ", arr[i]);
			
			if (cnt % 6 == 0) {
				System.out.println();
				
			}
			cnt ++;
			
		}
	}
}
