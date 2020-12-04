package com.coffee01;

import java.util.Scanner;

public class CoffeeMachine {
	
	public void inputMoney() {
		System.out.println("돈을 넣어주세요\n( 1 잔당 300 원)");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		if (money >= 300) {
			coffeeMake(money);
		} else {
			System.out.println("금액이 부족합니다.");
		}
	}
	
	private void coffeeMake(int money) {
		int coffee = money / 300;
		int chage = money % 300;
		System.out.println(" 커피 " + coffee + " 잔 나왔습니다");
		System.out.println((chage > 0) ? "잔돈은" + chage + " 원 입니다" : "");
	}
}
