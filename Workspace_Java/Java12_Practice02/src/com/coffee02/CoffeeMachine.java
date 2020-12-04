package com.coffee02;

import java.util.Scanner;

public class CoffeeMachine {
	public void inputMoney() {
		System.out.println("돈을 넣어주세요\n( 1 잔당 300 원)");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		System.out.println("몇잔을 만들까요 (정수만 입력)");
		int coffee = sc.nextInt();
		
		coffeMake(money, coffee);
	}
	private void coffeMake(int money, int coffee) {
		int change = money- (coffee * 300);
		
		if (change>=0) {
			System.out.printf(" 커피 %d 잔이 나왔습니다 \n 잔돈은 %d  원 입니다 \n",coffee,change);
		} else {
			System.out.printf("금액이 부족합니다. \n 잔돈은 %d 원 입니다\n",money );
		}
	}
}
