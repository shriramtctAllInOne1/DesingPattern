package com.creational.builderDesingPattern;

public interface HouseBuilder {

	void buildBaement(String basemMent);

	void buildStructure(String structure);

	void buildRoof(String roof);

	void buildInteriro(String interior);
	
	House getHouse();
}
