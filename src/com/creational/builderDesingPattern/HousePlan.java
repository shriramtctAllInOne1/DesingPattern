package com.creational.builderDesingPattern;

/**
 * @author P7111381
 *
 */
public interface HousePlan {
	/**
	 * @param structure
	 */
	void setStructure(String structure);

	/**
	 * @param roof
	 */
	void setRoof(String roof);

	/**
	 * @param baseMent
	 */
	void setBaseMent(String baseMent);

	/**
	 * @param interior
	 */
	void setInterior(String interior);
}
