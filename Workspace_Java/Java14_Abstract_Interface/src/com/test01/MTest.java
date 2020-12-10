package com.test01;

public class MTest {
	public static void main(String[] args) {
		
		
		// 오류 : Cannot instantiate the type Animal 객체로 만들수 없음 -> 추상클래스 이기 때문에
		//Animal animal = new Animal();
		
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.bark();
		dog.bark();
		
		cat.eat("생선");
		dog.eat("뼈다귀");
	}
}
