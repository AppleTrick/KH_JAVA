package com.test03;

public class SumX {
	
	/*
	 *    1    2    3    4     5 
	 *    6    7    8    9    10
	 *    11 12  13  14  15
	 *    16 17  18  19  20
	 *    21 22  23  24  25
	 *    
	 *    이렇게 하고 x 의 합을 출력하자
	 */
	
	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print( num  +  "  ");
				if( (i + j == 6) || (i == j)) {
					sum += num;
				}
				num++;
			}
			System.out.println();
		}
		System.out.println("x의 합  : " + sum );
	}
}