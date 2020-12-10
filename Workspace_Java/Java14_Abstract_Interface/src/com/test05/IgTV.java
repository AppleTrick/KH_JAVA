package com.test05;

public class IgTV implements TV {
	
	private int volume;
	
	public IgTV() {
		System.out.println("IG TV 구매");
	}

	@Override
	public int volumUp() {
		volume += 1;
		return volume;
	}

	@Override
	public int volumDown() {
		volume -= 1;
		if(volume < 0) {
			volume = 0;
		}
		return volume;
	}

}
