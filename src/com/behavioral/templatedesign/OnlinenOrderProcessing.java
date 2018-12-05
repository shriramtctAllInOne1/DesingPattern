package com.behavioral.templatedesign;

public class OnlinenOrderProcessing extends OrderProcessingTemplate {

	@Override
	public void selectItem() {
		System.out.println("item selected");
		
	}

	@Override
	public void doPayment() {
		System.out.println("Item amount pay online by netbanking");
		
	}

	@Override
	public void doDelivery() {
		System.out.println("item sent to the delivery for given address");
		
	}

}
