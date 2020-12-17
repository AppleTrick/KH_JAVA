package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MTest02 {
	
	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FY6l3F%2FbtqMeiuTUXM%2FKk47sZ3Gorc4Pi26Vc4ECk%2Fimg.jpg");
		
		URLConnection urlConnection = url.openConnection();
		urlConnection.connect();
		
		byte[] b = new byte[1];
		DataInputStream di = new DataInputStream(urlConnection.getInputStream());
		FileOutputStream fo = new FileOutputStream("a.jpg");
		
		while(di.read(b,0,1) != -1) {
			fo.write(b,0,1);
		}
		fo.close();
		di.close();
	}
}
