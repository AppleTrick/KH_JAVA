package com.test02;

public class MTest {
	public static void main(String[] args) {
		FruitBasket  bananaBasket = new FruitBasket();
		bananaBasket.basketSetting("바나나", 10);
		
		FruitBasket.basketSize= 20;
		//bananaBasket.basketSize = 15;
		System.out.println(bananaBasket.basketSize);
		//FruitBasket.count = 100;
		
		FruitBasket appleBasket = new FruitBasket();
		appleBasket.basketSetting("사과", 21);
		System.out.println(appleBasket.basketSize);
		System.out.println(appleBasket.fruitName);
		
		FruitBasket perBasket = new FruitBasket();
		perBasket.basketSetting("배", 1);
		System.out.println(perBasket.basketSize);
		System.out.println(perBasket.fruitName);
	}
}
