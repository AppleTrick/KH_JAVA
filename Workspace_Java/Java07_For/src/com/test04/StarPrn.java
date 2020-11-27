package com.test04;

public class StarPrn {
	
	/*
	 * 1.
	 * ★
	 * ★★
	 * ★★★
	 * ★★★★
	 * ★★★★★
	 * 
	 * 2.
	 * ★★★★★
	 * ★★★★
	 * ★★★
	 * ★★
	 * ★
	 * 
	 * 
	 * 3.
	 *            ★
	 *         ★★
	 *      ★★★
	 *   ★★★★
	 *★★★★★ 
	 * 
	 * 4.
	 * ★★★★★
	 *    ★★★★
	 *       ★★★
	 *          ★★
	 *             ★
	 *  
	 * 5.
	 * 
	 *       ★    
	 *    ★★★
	 * ★★★★★
	 */
	public void prn01() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}

	public void prn02() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("★");
			}
			for (int j = 5; j > i ; j--) {
				System.out.print("   ");
			}
			System.out.println();
		}
	}

	public void prn03() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("   ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

	}

	public void prn04() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("   ");
			}
			for (int j = 0; j < 5-i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}

	public void prn05() {
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5-i; j++) {
				System.out.print("   ");
			}
			for (int j = 0; j < i*2 + 1; j++) {
				System.out.print("★");
			}
			System.out.println("");
		}
	}
}
