package com.creational.stdpdesignpattern;

/**
 * @author shriram
 *
 */
public class LazyInitalizationstp {

	/**
	 * 
	 */
	private static LazyInitalizationstp lazyInitalizationstpobj;

	/**
	 * 
	 */
	private LazyInitalizationstp() {

	}

	/**
	 * @return
	 */
	public static LazyInitalizationstp getInstance() {
		if (lazyInitalizationstpobj == null) {
			lazyInitalizationstpobj = new LazyInitalizationstp();
		}
		return lazyInitalizationstpobj;
	}
}
