package com.creational.stdpdesignpattern;

/**
 * @author shriram
 *
 */
public class StaticBlockInitalizationstp {

	private static StaticBlockInitalizationstp staticBlockInitalizationstpObj;

	/**
	 * 
	 */
	private StaticBlockInitalizationstp() {
	}

	static {
		staticBlockInitalizationstpObj = new StaticBlockInitalizationstp();
	}

	public static StaticBlockInitalizationstp getInstance() {
       
		return staticBlockInitalizationstpObj;

	}
}
