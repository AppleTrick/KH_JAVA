package com.test02;

public class MyException extends Exception {

	public MyException() {
		this("내가만든 예외");
	}

	public MyException(String message) {
		super(message);
	}	
}
