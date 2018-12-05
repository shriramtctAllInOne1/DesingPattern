package com.behavioral.chnainofresponsibility;

public class SupportMainApp {

	public static void main(String[] args) {
		AbstractSupportHandler handler = RequestClient.getHanlder();
		handler.reciveRequest(AbstractSupportHandler.TECHNICAL, " I'm having problem with my internet connectivity.");
		System.out.println("............................................");
		handler.reciveRequest(AbstractSupportHandler.BILLING, "Please resend my bill of this month.");
		System.out.println("............................................");
		handler.reciveRequest(AbstractSupportHandler.GENERAL, "Please send any other plans for home users.");
	}
}
