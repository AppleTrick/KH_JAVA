package com.test02;

public class ContinueTest {
	public static void main(String[] args) {
		prn();
	}
	
	public static void prn() {
		int i = 0;
		
		while (i < 10 ) {
			i ++;
			if(i%2 == 0) {
				continue;
				// 밑에 있는 조건을 띄어넘고 다음 조건으로 넘어 간다.
			}		
			System.out.println(i);
		}
	}
}
