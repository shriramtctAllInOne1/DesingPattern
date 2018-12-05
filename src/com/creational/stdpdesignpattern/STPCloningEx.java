package com.creational.stdpdesignpattern;

public class STPCloningEx implements Cloneable {

	private static STPCloningEx stpCloningExOj = new STPCloningEx();

	private STPCloningEx() {

	}

	public static STPCloningEx getInstance() {
		return stpCloningExOj;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		//throw new CloneNotSupportedException();
		return stpCloningExOj;
	}
}
