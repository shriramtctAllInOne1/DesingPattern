package com.structure.adapterDesignPattern;

public class AdapterPatternDemo {

	public static void main(String [] args){
		AudioPlayer obj = new AudioPlayer();
		obj.play("Mp4", "alone.mp4");
		obj.play("vlc", "faraway.mp4");
		obj.play("mp3", "faraway.mp4");
	}
}
