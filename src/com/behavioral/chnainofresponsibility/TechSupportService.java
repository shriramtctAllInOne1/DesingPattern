package com.behavioral.chnainofresponsibility;

public class TechSupportService extends AbstractSupportHandler {

	public TechSupportService(String level) {
		this.level = level;
	}

	@Override
	protected void handleRequest(String message) {
        System.out.println("Techsupport handling the request");
	}

}
