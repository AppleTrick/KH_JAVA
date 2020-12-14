package com.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCal {
	
	public int calculation() {
		
		int res = 0;
		
		while(true) {
			try {
				res = inputNum()/inputNum();
			} catch (InputMismatchException e) {
				//e.printStackTrace();
				System.out.println("잘못 입력하셧습니다. 숫자만 입력해주세요");
			}
//			} catch(ArithmeticException e) {
//				System.out.println("0 으로 나누면 안됩니다. 다시 입력해주세요");
//			}finally {
//				System.out.println("계산완료");
//			}
		}
	}
	
	public int inputNum() {
		int n = 0;
		System.out.println("숫자만 입력하세요");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		return n;
	}
}
