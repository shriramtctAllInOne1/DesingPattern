package com.creational.builderDesingPattern;

public class CivilEng {
	HouseBuilder houseBuilder;

	public HouseBuilder getHouseBuilder() {
		return houseBuilder;
	}

	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public CivilEng() {
	
	}

	public House getHouse() {
		return houseBuilder.getHouse();
	}

	public void constructHouse(String basement, String roof, String interior, String structure) {
		houseBuilder.buildBaement(basement);
		houseBuilder.buildStructure(structure);
		houseBuilder.buildRoof(roof);
		houseBuilder.buildInteriro(interior);
	}
}
