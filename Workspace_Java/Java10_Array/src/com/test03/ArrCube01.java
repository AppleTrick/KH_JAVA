package com.test03;

public class ArrCube01 {

	/*
	 * 1 4 7 
	 * 2 5 8
	 * 3 6 9
	 * 
	 * 모양의 이차원 배열을 만들어서 출력하자.
	 * 
	 */
	
	public static void main(String[] args) {
//		int[][] a = new int[3][3];
//		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[j].length; j++) {
//				System.out.print( i + 1 + (j * 3) + "\t" );
//				if (j == 2) {
//					System.out.println();
//				}
//			}
//		}
	
		int[][] arr = new int[3][3];		
		
		int cnt = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i] = cnt ++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
