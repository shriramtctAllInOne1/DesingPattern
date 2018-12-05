package com.behavioral.observer;

public class MainApp {

	public static void main(String[] args) {
		PrintMedia printMedia = new PrintMedia();
		OnlineMedia onlineMedia = new OnlineMedia();

		BankPublisher hdfcBank = new BankPublisher("Public", "Hdfc", 8.7);
		BankPublisher sbiBank = new BankPublisher("SBI", "SBI", 6.7);

		hdfcBank.register(printMedia);
		hdfcBank.register(onlineMedia);
		sbiBank.register(onlineMedia);
		sbiBank.register(printMedia);
		
		hdfcBank.notify();
		sbiBank.notify();
	}

}
