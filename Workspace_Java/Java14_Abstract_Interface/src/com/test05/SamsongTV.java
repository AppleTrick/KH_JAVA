package com.test05;

public class SamsongTV implements TV {
	
	private int volume;
	
	public SamsongTV() {
		System.out.println("Samsong TV 구매");
	}

	@Override
	public int volumUp() {
		// TODO Auto-generated method stub
		volume += 3;
		return volume;
	}

	@Override
	public int volumDown() {
		// TODO Auto-generated method stub
		volume -= 1;
		if(volume < 0) {
			volume = 0;
		}
		return volume;
	}

}
