package com.test02;

/*
 * A B C D E 
 * F G H I  
 */

public class BreakTest {
	public static void main(String[] args) {
		prn();
	}
	
	public static void prn() {
		int count = 0;
		char c = 'A';
		boolean stop = false;
		
		while (!stop) {
			while(true) {
				System.out.print(c + " ");
				c ++;
				count ++;
				
				if (count % 5 == 0) {
					break;
				}
				if (count == 26) {
					stop = true;
					break;
				}
			}
			System.out.println();
		}
	}
}
