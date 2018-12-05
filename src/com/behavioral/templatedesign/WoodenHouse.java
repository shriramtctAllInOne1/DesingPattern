package com.behavioral.templatedesign;

public class WoodenHouse extends HouseTempalte {

	@Override
	public void buildBasement() {
       System.out.println("Build iron, concerte,cement house");
	}

	@Override
	public void buildPillers() {
	       System.out.println("Build pillers with wood");

	}

	@Override
	public void buildWalls() {
	       System.out.println("Build Walls with wood");


	}

	@Override
	public void buildWindow() {
	       System.out.println("Build Glass Window");


	}

	@Override
	public void buildRoof() {
	       System.out.println("Build woods Roof");

	}
}
