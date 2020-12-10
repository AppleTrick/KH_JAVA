package com.test06;

import java.util.Scanner;

public class Circle extends AreaImpl {
	Scanner sc = new Scanner(System.in);
	private int radius;
	private double area;

	@Override
	public void make() {
		System.out.println("반지름을 입력해주세요 ");
		radius = sc.nextInt();
	}

	public void print() {
		area = radius * radius * Math.PI;
		setResult(Double.toString(area));
		System.out.print("원의  ");
		super.print();
	}
}
