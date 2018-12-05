package com.structure.adapterDesignPattern1;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		DBHelper obj = new DBHelper();
		obj.connect("oracle");
		obj.connect("sql");
		obj.connect("h2db");
	}
}
