package com.test06;

import java.util.Scanner;

public class Square extends AreaImpl {
	Scanner sc = new Scanner(System.in);
	private int height;
	private int width;
	private double area;

	@Override
	public void make() {
		System.out.println("밑변을 입력해주세요  : " );
		width = sc.nextInt();
		System.out.println("높이를 입력해주세요  : " );
		height = sc.nextInt();
	}

	public void print() {
		area = width * height;
		setResult(Double.toString(area));
		System.out.print("사각형의  ");
		super.print();
	}
}
