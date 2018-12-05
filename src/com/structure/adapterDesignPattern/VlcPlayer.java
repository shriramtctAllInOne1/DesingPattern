package com.structure.adapterDesignPattern;

public class VlcPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
     System.out.println("Play file in vlc Player : "+fileName);		
	}

	@Override
	public void playMp4(String fileName) {
	    System.out.println("do nothing");		
	}

}
