package com.behavioral.templatedesign;

public class StoreOrderProcessing extends OrderProcessingTemplate {

	@Override
	public void selectItem() {
		System.out.println("item selected at store");

	}

	@Override
	public void doPayment() {
		System.out.println("Item amount pay on store");

	}

	@Override
	public void doDelivery() {
		System.out.println("item sent to the delivery at reception");

	}

}
