package com.creational.builderDesingPattern;

public class MainUtil {
	public static void main(String[] args) {
		CivilEng eng = new CivilEng();
		HouseBuilder houseBuilder = new IglooHouseBuilder();
		eng.setHouseBuilder(houseBuilder);
		eng.constructHouse("iglobase", "igloRoof", "igloiteriror", "iglosturcture");
		House house = eng.getHouse();
		System.out.println(house);
		HouseBuilder houseBuildertip = new TipHouseBuilder();
		eng.setHouseBuilder(houseBuildertip);
		eng.constructHouse("tipbase", "tipRoof", "tipnteriror", "tipsturcture");
		House house1 = eng.getHouse();
		System.out.println(house1);
	}

}
