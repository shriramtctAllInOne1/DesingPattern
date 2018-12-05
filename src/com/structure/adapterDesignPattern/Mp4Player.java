package com.structure.adapterDesignPattern;

public class Mp4Player implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("do nothing");
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Play file in Mp4 Player :" + fileName);
	}

}
