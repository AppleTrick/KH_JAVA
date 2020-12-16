package com.test01;

import java.io.File;
import java.io.IOException;

public class MTest01 {

	
	public static void main(String[] args) {
		
		File fi = new File("C:/test_io");		// 원래는 \ 역슬래쉬에이다.
		// mac : /User/계정/test_io
		
		if (fi.exists()) {
			System.out.println("exists");
		} else {
			System.out.println("make directory");
			fi.mkdir();
			/// 디렉토리 생성 명령어
		}
		
		// fi 안에 (밑에) AA 라는 folder(directory) 생성
		File fiAA = new File(fi,"AA");
		fiAA.mkdir();
		File fiBB = new File("C:\\test_io","BB");
		// \t 탭 방지하기 위해 \\ 두번사용하게 된다.
		fiBB.mkdir();
		
		// AA 안에 a.txt 파일 생성
		File aTxt = new File(fiAA,"a.txt");
		
		try {
			//checked exception
			aTxt.createNewFile();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
