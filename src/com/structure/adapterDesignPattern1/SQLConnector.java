package com.structure.adapterDesignPattern1;

public class SQLConnector implements CommonDbConnector {

	@Override
	public void connectToOracle() {
      System.out.println("do nothing");		
	}

	@Override
	public void connectToSQL() {
		System.out.println("connect to SQL db");
		
	}

}
