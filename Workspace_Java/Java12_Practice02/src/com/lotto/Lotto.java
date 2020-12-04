package com.lotto;

import java.util.Arrays;

public class Lotto {
	
	// 로또 " 배열 "
	// 1 ~ 45 사이의 "중복 없는 " 랜덤한 숫자 6개
	// 정렬
	
//	public void prn() {
//		
//		int[] resultNum = new int[7];
//		
//		for (int i = 0; i < resultNum.length; i++) {
//			resultNum[i] = (int) ((Math.random()*45 )+1);
//			for (int j = 0; j <i; j++) {
//				if (resultNum[i] == resultNum[j]) {
//					i--;
//				}
//			}
//		}
//		for (int i = 0; i < resultNum.length; i++) {
//			for (int j = 0; j < resultNum.length; j++) {
//				if (resultNum[i] < resultNum[j]) {
//					int switchNum = resultNum[i];
//					resultNum[i] = resultNum[j];
//					resultNum[j] = switchNum;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(resultNum));
//	}
	
	private int[] make() {
		int[] arr =new int[6];
		
		int index = 0;
		while(index < 6) {
			int insert = (int)(Math.random()*45) + 1;
			
			if (!isSame(arr, insert)) {
				arr[index] = insert;
				index++;
			}
		}
		
		
		return arr;
	}
	
	private boolean isSame(int[] arr, int insert) {
		boolean same = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == insert) {
				same = true;
				break;
			}
		}
		return false;
	}
	
	private void sort(int [] arr) {	//bubble sort
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j-1]) {
					int tmp  = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}
	}
	
	public void prn() {
		int [] arr = make();
		//System.out.println(Arrays.toString(arr));
		sort(arr);
		
		System.out.printf("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%3d",arr[i]);
		}
		System.out.println("}");
	}
}
