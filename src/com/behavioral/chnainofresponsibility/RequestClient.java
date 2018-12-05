package com.behavioral.chnainofresponsibility;

public class RequestClient {

	public static AbstractSupportHandler getHanlder() {
		AbstractSupportHandler techHandler = new TechSupportService(AbstractSupportHandler.TECHNICAL);
		AbstractSupportHandler billingHandler = new BillingSupportService(AbstractSupportHandler.BILLING);
		AbstractSupportHandler generalHandler = new GeneralService(AbstractSupportHandler.GENERAL);
		techHandler.setNextHanlder(billingHandler);
		techHandler.setNextHanlder(generalHandler);
		return techHandler;

	}
}
