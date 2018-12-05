package com.behavioral.templatedesign;

public class HouseClient {

	public static void main(String[] args) {
		WoodenHouse wObj = new WoodenHouse();
		GlassHouse gObj = new GlassHouse();
		wObj.build();
		gObj.build();
	}
}
