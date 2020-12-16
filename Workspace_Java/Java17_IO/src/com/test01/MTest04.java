package com.test01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest04 {
	public static void main(String[] args) throws IOException {
		File fi = new File("b.txt");

		MyOutput(fi);
		MyInput(fi);
	}
	// read
	private static void MyInput(File fi) throws IOException {
		FileReader fr = new FileReader(fi);
		int ch;
		while((ch = fr.read()) != -1) {
			System.out.println(ch);
		}
		fr.close();
	}
	
	// write
	private static void MyOutput(File fi) throws IOException {
		FileWriter fw = new FileWriter(fi,true);
		
		fw.write("연습중입니다 \n");
		fw.append("abc\t").append("def");
		//write 와 append 차이
		// : write 는 작성하고 끝
		// : append 는 자기자신을 다시 리턴해준다. 그래서 한번더 사용할 수 있다.
		
		fw.close();
	}
}
