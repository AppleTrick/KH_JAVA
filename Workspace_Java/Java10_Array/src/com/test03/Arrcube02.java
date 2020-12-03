package com.test03;

public class Arrcube02 {
	/*
	 * 1 2 3 4 5 
	 * 10 9 8 7 6
	 * 11 12 13 14 15
	 * 20 19 18 17 16
	 * 21 22 23 24 25
	 * 
	 * 모양의 이차원 배열을 만들어서 출력하자.
	 */
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
//		int count = 1;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.printf(count + "\t");
//				count ++;
//				if (j == 4) {
//					System.out.println();
//				}
//			}
//		}
		
		int cnt = 1;
		// 값 저장
		for (int i = 0; i < arr.length; i++) {
			
			// i 가 0,2,4 일때 정방향
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = cnt++;
				}
			} else { // i 가 역방향  1,3
				for (int j = arr[i].length-1 ; j>=0; j--) {
					arr[i][j] = cnt ++;
				}
			}
		}
		
		// 값 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
