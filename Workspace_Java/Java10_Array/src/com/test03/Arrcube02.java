package com.test03;

public class Arrcube02 {
	/*
	 * 1 2 3 4 5 
	 * 6 7 8 9 10
	 * 11 12 13 14 15
	 * 16 17 18 19 20
	 * 21 22 23 24 25
	 * 
	 * 모양의 이차원 배열을 만들어서 출력하자.
	 */
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf(count + "\t");
				count ++;
				if (j == 4) {
					System.out.println();
				}
			}
		}
	}
}
