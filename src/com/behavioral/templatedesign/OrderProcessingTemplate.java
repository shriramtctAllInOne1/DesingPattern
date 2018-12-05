package com.behavioral.templatedesign;

public abstract class OrderProcessingTemplate {

	public final void processOrder() {
		selectItem();
		doPayment();
		itemWrap();
		doDelivery();
	}

	public abstract void selectItem();

	public abstract void doPayment();

	public void itemWrap() {
		try {
			System.out.println("Gift wrap successfull");
		} catch (Exception e) {
			System.out.println("Gift wrap unsuccessful");
		}
	}

	public abstract void doDelivery();

}
