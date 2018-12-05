package com.behavioral.templatedesign;

public class GlassHouse extends HouseTempalte {

	@Override
	public void buildBasement() {
		System.out.println("Build house with iron ,cement,concerete");

	}

	@Override
	public void buildPillers() {
		System.out.println("Build pillers with glass");

	}

	@Override
	public void buildWalls() {
		System.out.println("Build walls with glass");

	}

	@Override
	public void buildWindow() {
		System.out.println("Build glass window");

	}

	@Override
	public void buildRoof() {
		System.out.println("Build roof of glass");

	}

}
