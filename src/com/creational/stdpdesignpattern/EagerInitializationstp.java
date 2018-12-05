package com.creational.stdpdesignpattern;

import java.io.Serializable;

/**
 * @author Shriram
 *
 */
public class EagerInitializationstp implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final EagerInitializationstp eagerInitializationstpobj = new EagerInitializationstp();

	/**
	 * 
	 */
	private EagerInitializationstp() {

	}

	/**
	 * @return
	 */
	public static EagerInitializationstp getInstance() {

		return eagerInitializationstpobj;

	}

	protected Object readResolve() {
		return eagerInitializationstpobj;
	}
}
