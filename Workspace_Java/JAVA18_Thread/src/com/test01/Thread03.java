package com.test01;

class MyThread03 extends Thread{
	
	public MyThread03(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(this.getName() + " : " + i);
		}
		System.out.println(this.getName() + " 끝 !!!!!!!!!!!!");
	}
}
public class Thread03 {

	
	public static void main(String[] args) {
		
		MyThread03 m1= new MyThread03("멍멍");
		MyThread03 m2 = new MyThread03("야옹");
		
		// java 의 thread scheduling 은 우선순위와 순환할당 방싱르 사용한다,ㄹ
		
		
		// priority : 우선순위 --> 순위가 높은 애부터 시작을 준다.
		//dog.setPriority(10);
		//cat.setPriority(Thread.MIN_PRIORITY);
		
		//dog.start();
		//cat.start();
		
		long startTime = System.currentTimeMillis();
		
		m1.start();
		
		try {
			// join() ; 해당 thread 가 종료될때 가지 다른 thread 를 멈춤
			m1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		m2.start();
		
		long endTime = System.currentTimeMillis();	/// 현재 시간 milisecond로 리턴
		
		System.out.println("실행 시간 : " + (endTime - startTime));
	}
}
