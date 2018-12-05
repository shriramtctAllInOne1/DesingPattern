package com.behavioral.chnainofresponsibility;

public class BillingSupportService extends AbstractSupportHandler {

	public BillingSupportService(String level) {
		this.level = level;
	}

	@Override
	protected void handleRequest(String message) {

		System.out.println("BillingSupportService handling request");
	}

}
