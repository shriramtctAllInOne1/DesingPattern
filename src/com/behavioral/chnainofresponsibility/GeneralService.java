package com.behavioral.chnainofresponsibility;

public class GeneralService extends AbstractSupportHandler {

	public GeneralService(String level) {
		this.level = level;
	}

	@Override
	protected void handleRequest(String message) {
		System.out.println("General Request can be hanldle by any support team");

	}

}
