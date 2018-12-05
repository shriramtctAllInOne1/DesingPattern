package com.structure.adapterDesignPattern1;

public class DBHelper implements DbConnector {

	ConnectionAdapter adapter;

	@Override
	public void connect(String connectionType) {
		if ("oracle".equals(connectionType) || "sql".equals(connectionType)) {
			adapter = new ConnectionAdapter(connectionType);
			adapter.connect(connectionType);
		} else {
			System.out.println("Connection type not supported");
		}
	}

}
