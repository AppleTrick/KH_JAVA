package com.test01;

import java.util.Arrays;
import java.util.Stack;

public class MTest01 {

	public static void main(String[] args) {
		
		
		// 방법 1.
		int[] a; 	// 선언 int  형 값을 받는 배열  a;		// 선언
		a = new int[5];											// 정의 - instance 인스턴스
		a[0] = 1;
		a[1] = 1;
		a[2] = 1;
		a[3] = 1;
		a[4] = 1;
		
		// 방법 2
		int [] b = new int[] {5,4,3,2,1};	// 선언 정의 초기화
		
		// 방법 3
		int[] c = {6,7,8,9,10}; 		// 선언 초기화
		
		System.out.println(a[0]);
		
		System.out.println(a[0] + b[1] + c [2]);
		
		System.out.println(c); 								// 배열이 저장된 주소값;
		System.out.println(Arrays.toString(c));		// java.util.Array (api) 에 있는 정의된 기능을 사용한것
		
		// java.util.Array 라는 메소드를 이용
		
		String[] s  = new String[] {"Have","a","nice","day"};
		
		prn(s);
		System.out.println();
		System.out.println();
		
		modi(s);
		
		System.out.println(Arrays.toString(s));
		
	}
	public static void prn(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	}
	
	public static void modi(String[] arr) {
		// nice -> good 변경후 전체 출력
		// have a good day array.to string 사용 금지
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]=="nice") {
				arr[i]="good";
			}
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();
		
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.printf("%s", arr[i]);
			} else {
				System.out.printf("%s ",arr[i]);
			}
		}
		System.out.println("]");
	}
}
