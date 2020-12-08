package com.aaa;

// public class AAA (extends Object)  extends -> 상속이란 키워드
// 자바의 모든 클래스는 object 를 상속 받는다 다만 모든 클래스가 오브젝트를 상속 받기 때문에 굳이 적지는 않는다
public class AAA {

	private int abc;
	
	// default constructor (기본 생성자)
	// 생성자를 만들지않으면 JVM이 자동적으로 생성자를 만든다
	// 다만 생성자를 만들어줄 경우 따로 생성해준다.
	public AAA() {
		System.out.println("AAA 생성");
	}
	
	// 핋드 초기화 생성자
	public AAA (int abc) {
		// this : 나 객체
		this.abc = abc;
		System.out.println("AAA 생성  -> abc : " + abc);
	}
	
	//getter & setter
	
	// 외부에서 값을 가지고오게 해준다.
	public int getAbc() {
		return abc;
	}
	
	// 외부에서 값을 설정할 수 있게 해준다. 처음에는 생성자
	public void setAbc(int abc) {
		this.abc = abc;
	}
	
	public void prn() {
		
		System.out.println("AAA 의 prn() 메소드");
	}
}
