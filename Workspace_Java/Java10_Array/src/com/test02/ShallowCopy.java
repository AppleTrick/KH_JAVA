package com.test02;

import java.util.Arrays;

public class ShallowCopy {
	// 얕은값 복사 ( 주소 값을 복사 )
	public static void main(String[] args) {
		int [] original = {10,20,30,40,50};
		int [] copy = original; 			// 오리지날을 주소값을 가지고 있는 것임
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		
		System.out.println(original);
		System.out.println(copy);
		
		copy[2] = 300;
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		// 같은 메모리를 둘이 공유를 하고 있음
		// 즉 하나를 바꾸면 다른것도 똑같이 바뀌게 됨
		// 해당 값이 가지고 있는 주소값을 가지고 있다.
		
	}
}
