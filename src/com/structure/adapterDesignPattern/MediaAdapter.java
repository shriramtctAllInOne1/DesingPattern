package com.structure.adapterDesignPattern;

public class MediaAdapter implements MediaPlayer {

	AdvanceMediaPlayer advanceMediaPlayer;

	MediaAdapter(String audioType) {
		if (audioType.equals("vlc")) {
			advanceMediaPlayer = new VlcPlayer();
		} else if (audioType.equals("Mp4")) {
			advanceMediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equals("vlc")) {
			advanceMediaPlayer.playVlc(fileName);
		} else if (audioType.equals("Mp4")) {
			advanceMediaPlayer.playMp4(fileName);
		}else{
			System.out.println("File not supported");
		}
	}

}
