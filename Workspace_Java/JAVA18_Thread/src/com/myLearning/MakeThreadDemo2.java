package com.myLearning;

class Task extends Thread{
	@Override
	public void run() {
		int n1 = 20;
		int n2 = 10;
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + ( n1 + n2));
	}
}


public class MakeThreadDemo2 {

	public static void main(String[] args) {
		
		Task t1 = new Task();
		Task t2 = new Task();
		
		t1.start();
		t2.start();
	}
}

