package com.creational.builderDesingPattern;

public class IglooHouseBuilder implements HouseBuilder {
	House house;

	public IglooHouseBuilder() {
		super();
		this.house = new House();
	}

	@Override
	public void buildBaement(String basemMent) {
		house.setBaseMent(basemMent);

	}

	@Override
	public void buildStructure(String structure) {
		house.setStructure(structure);

	}

	@Override
	public void buildRoof(String roof) {
		house.setRoof(roof);

	}

	@Override
	public void buildInteriro(String interior) {
		house.setInterior(interior);

	}

	@Override
	public House getHouse() {
		return house;
	}

}
