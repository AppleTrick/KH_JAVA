package com.test01;

import java.util.Arrays;

public class MTest02 {

	// 이차원 배열
	public static void main(String[] args) {
		// 배열은 크기가 고정된다.

		// 방법 1
		int[][] a = new int[3][2]; // 크기가 고정
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		a[2][0] = 5;
		a[2][1] = 6;

		System.out.println(Arrays.toString(a));
		// [[I@7637f22, [I@4926097b, [I@762efe5d]
		// 큰배열안에 3 개의 배열이 있다.
		System.out.println(Arrays.deepToString(a));

		// 방법 2

		int[][] b = new int[3][];

		b[0] = new int[3];
		b[1] = new int[5];
		b[2] = new int[1];

		// 방법 3

		int[][] c = new int[][] {
			{1,2},
			{3,4,5},
			{6,7,8,9},
			{10}		
		};
		
		// 방법 4
		int[][] d = {
				{1,2,3,4},
				{5},
				{6,7,8},
				{9,10}		
		};
		
		System.out.println(c[2][2] + d[3][0]);
		
		System.out.println(c[0].length);
		System.out.println(c[1].length);
		System.out.println(c[2].length);
		System.out.println(c[3].length);
		
		prn(a);
		prn(b);
		prn(c);
		prn(d);
		
		String[][] s = {{"have" ,"a ", "nice","day"},{"너무","어려워"},{"일차원","배열","이차원","배열"}};
		
		modi(s);
	}
	public static void modi(String[][] arr) {
		// nice -> good
		// 어려워 -> 쉬워
		
		//  출력 예)
		/*
		 * have a good day
		 * 너무 쉬워
		 * 일차원 배열 이차원 배열
		 */
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == "어려워") {
					arr[i][j] = "쉬워";
				} else if (arr[i][j] == "nice") {
					arr[i][j] = "good";
				}
				System.out.printf("%s ",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public static void prn(int[][] arr) {
		System.out.println("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("{");
			
			for (int j = 0; j < arr[i].length; j++) {
				if ( j == arr[i].length-1) {
					System.out.printf("%d" , arr[i][j]);
				}else {
					System.out.printf("%d ," , arr[i][j]);
				}
			}
			
			if (i == arr.length-1) {
				System.out.println("}");
			}else {
				
			}System.out.println("}, ");
			
		}
	}
}
/*
 *  배열 : 여러개의 ' 같은 타입의 값을 효과적으로 관리하기 위한 객체 
 *  
 *   index => 배열 값이 저장된 위치 0 ~ length-1 까지 있다.
 *   
 *  
 */
