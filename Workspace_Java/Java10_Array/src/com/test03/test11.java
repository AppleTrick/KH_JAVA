package com.test03;

public class test11 {
	public static void main(String[] args) {
		
		int arr [][] = new int[][] {
			{0,0,0,0},
			{0,0,0},
			{0,0}
		};
		
		int cnt = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt++;
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
