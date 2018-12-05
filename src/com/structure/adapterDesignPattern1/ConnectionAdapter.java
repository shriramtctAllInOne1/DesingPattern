package com.structure.adapterDesignPattern1;

public class ConnectionAdapter implements DbConnector {

	CommonDbConnector con = null;

	ConnectionAdapter(String connectionType) {
		if ("oracle".equals(connectionType)) {
			con = new OracleConnector();
		} else if ("sql".equals(connectionType)) {
			con = new SQLConnector();
		}
	}

	@Override
	public void connect(String connectionType) {
		if ("oracle".equals(connectionType)) {
			con.connectToOracle();
		} else if ("sql".equals(connectionType)) {
			con.connectToSQL();
		} else {
			System.out.println("db type not supported");
		}
	}

}
