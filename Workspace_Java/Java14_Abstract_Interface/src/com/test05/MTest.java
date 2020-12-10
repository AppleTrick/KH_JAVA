package com.test05;

public class MTest {
	public static void main(String[] args) {
		TV ig = new IgTV();															// ig tv 구매
		System.out.println(ig.volumUp());									// 1
		System.out.println(ig.volumUp());									// 2
		System.out.println(ig.volumUp());									// 3
		System.out.println(ig.volumUp());									// 4
		
		System.out.println(ig.volumDown());							// 3
		System.out.println(ig.volumDown());							// 2
		System.out.println(ig.volumDown());							// 1
		System.out.println(ig.volumDown());							// 0

		TV samsong = new SamsongTV();									// samsong 티비 구매
		System.out.println(samsong.volumUp());						// 3
		System.out.println(samsong.volumUp());						// 6
		System.out.println(samsong.volumUp());						// 9
		System.out.println(samsong.volumUp());						// 12

	}
}
