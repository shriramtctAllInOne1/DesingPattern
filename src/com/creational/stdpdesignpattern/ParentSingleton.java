package com.creational.stdpdesignpattern;

public class ParentSingleton {

	private static ParentSingleton instance;

	protected ParentSingleton() {
	}

	public static synchronized ParentSingleton getInstance() {
		if (instance == null) {
			instance = new ParentSingleton();
		}

		return instance;
	}

}
