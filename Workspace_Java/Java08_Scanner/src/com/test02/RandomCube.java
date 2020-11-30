package com.test02;

import java.util.Random;

public class RandomCube {
	public static void main(String[] args) {
		/*
		 *  1 ~ 9 사이의 난수로 이루어진
		 *  5 * 5 형태의 숫자를 출력하고
		 *  전체 난수의 합
		 *  전체 난수의 평균
		 *  x 의 합을 구하자
		 *  
		 *  
		 */
		
		prnCube();
	}

	public static void prnCube() {
		// TODO Auto-generated method stub
		
		int randNum;
		int randSum = 0;
		
		for (int i = 0; i < 25; i++) {
			randNum =(int)(Math.random() * 9 +1 ) +1;
			if (i % 5 == 0) {
				System.out.println();
			}
			System.out.printf("%d ",randNum);
			
			randSum = randSum + randNum;
		}
		System.out.println();
		System.out.println("전체 난수의 합은 : " + randSum);
		double randAvg = (double)randSum / 25;
		System.out.println("전체 난수의 평균은 " + randAvg);
	}
}
