package com.structure.adapterDesignPattern1;

public class OracleConnector implements CommonDbConnector{

	@Override
	public void connectToOracle() {
		System.out.println("connect to oracle db");
	}

	@Override
	public void connectToSQL() {
		System.out.println("do nothing");

	}

}
