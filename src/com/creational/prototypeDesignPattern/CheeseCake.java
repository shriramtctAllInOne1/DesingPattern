package com.creational.prototypeDesignPattern;

public class CheeseCake implements Cake {
	private String sugar;
	private String butter;
	private String cheese;
	private String name;

	public void addSugar(String sugar) {
		this.sugar = sugar;
	}

	public void addButter(String butter) {
		this.butter = butter;
	}

	void addCheese(String cheese) {
		this.cheese = cheese;
	}

	public void addName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CheeseCake [sugar=" + sugar + ", butter=" + butter + ", cheese=" + cheese + ", name=" + name + "]";
	}

	@Override
	public Cake prepareCake() {
		Cake cake = null;
		try {
			cake = (Cake) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cake;
	}
}
