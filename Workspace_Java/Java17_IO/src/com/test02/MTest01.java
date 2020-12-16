package com.test02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MTest01 {
	
	public static void main(String[] args) throws IOException {
		
		String file = "a.jpg";
		
		/*
		FileInputStream fi = new FileInputStream(file);
		
		BufferedInputStream bi = new BufferedInputStream(fi);
		*/
		// 위의 두줄을 한줄로
		// Buffered는 뭉텅이로 가지고 온다. -> 파일데이터를 인풋함
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		
		// c.jpg 생성을 통해 를 통해 아웃풋함
		//
		FileOutputStream fo = new FileOutputStream(new File("c.jpg"));
		
		int a = 0;
		while(( a = bi.read()) != -1) {
			fo.write(a);
		}
		
		// 가장 마지막에 연결한 객체를 가장 먼저 닫자
		fo.close();
		bi.close();
		
	}
}
