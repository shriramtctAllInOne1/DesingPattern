package com.behavioral.templatedesign;

public abstract class HouseTempalte {

	public final void build() {
		buildBasement();
		buildPillers();
		buildWalls();
		buildWindow();
		buildRoof();
	}

	public abstract void buildBasement();

	public abstract void buildPillers();

	public abstract void buildWalls();

	public abstract void buildWindow();

	public abstract void buildRoof();

}
