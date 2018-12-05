package com.structure.adapterDesignPattern;

public class AudioPlayer implements MediaPlayer {
	public MediaAdapter mediaAdapter;

	@Override
	public void play(String audiotype, String fileName) {

		if (audiotype.equals("Mp4") || audiotype.equals("vlc")) {
			mediaAdapter = new MediaAdapter(audiotype);
			mediaAdapter.play(audiotype, fileName);
		} else {
			System.out.println("Format not supported");
		}
	}
}
