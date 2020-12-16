package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest05 {

	public static void main(String[] args) {
		
		File fi = new File("b.txt");
		
		MyOutput(fi);
		MyInput(fi);
	}

	private static void MyOutput(File fi) {	// throws 를 안하고 try catch 로 대체한다. 메소드로 대체 가능하다.
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fi, true);
			fw.write("다시 연습합니다.");
			fw.append("abc\n");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 
	}

	private static void MyInput(File fi) {
		// try with resources
		// try () 안에 넣어주면 객체를 알아서 종료시켜줌 fr.close를 해줄 필요가 없음
		try(FileReader fr = new FileReader(fi)){
			int ch;
			
			while((ch = fr.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
