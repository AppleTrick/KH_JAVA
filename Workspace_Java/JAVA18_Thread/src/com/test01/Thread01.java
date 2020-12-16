package com.test01;

class MyThread01 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(" i : " + i);
		}
		
	}
}

public class Thread01 {
	
	public static void main(String[] args) {
		
		// thread 는 병렬 처리하는 것
		
		System.out.println("main start ---------------");
		// thread  가 아니다
//		MyThread01 my01 = new MyThread01();
//		MyThread01 my02 = new MyThread01();
//		
//		my01.run();
//		my02.run();
		
		// thread 로 할 경우
		// 시퀀스 다이어 그램 : 메소드의 흐름
		
		// 쓰레드로 만들게 되면
		Thread my01 = new Thread(new MyThread01());
		Thread my02 = new Thread(new MyThread01());
		
		my01.start();	// run 을 자동으로 호출시킴
		my02.start();
		
		
		
		System.out.println("main stop -----------------");
	}
}
