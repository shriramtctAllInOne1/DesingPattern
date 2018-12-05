package com.creational.builderDesingPattern;

public class House implements HousePlan {

	private String structure;
	private String roof;
	private String baseMent;
	private String interior;

	@Override
	public void setStructure(String structure) {
		this.structure = structure;
	}

	@Override
	public void setRoof(String roof) {
		this.roof = roof;
	}

	@Override
	public void setBaseMent(String baseMent) {
		this.baseMent = baseMent;

	}

	@Override
	public void setInterior(String interior) {
		this.interior = interior;

	}

}
