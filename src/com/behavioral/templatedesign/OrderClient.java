package com.behavioral.templatedesign;

//https://www.geeksforgeeks.org/template-method-design-pattern/
public class OrderClient {
	
	public static void main(String [] args){
		OrderProcessingTemplate onlineOrder= new OnlinenOrderProcessing();
		OrderProcessingTemplate storeOrder= new StoreOrderProcessing();
		onlineOrder.processOrder();
		storeOrder.processOrder();
	}

}
