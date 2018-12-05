package com.behavioral.mediatorDesign;

//http://codepumpkin.com/mediator-design-pattern/
//https://sourcemaking.com/design_patterns/mediator/java/2
public class PCMediator {

	public int number;
	public boolean isSlotFull = false;

	public synchronized void storeMessage(int num) {
		try {
			while (isSlotFull) {
				wait();
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		isSlotFull = true;
		notifyAll();
		number = num;

	}

	public synchronized int retriveMessage() {
		try {
			while (!isSlotFull) {
				wait();
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		isSlotFull = false;
		notifyAll();
		return number;

	}

}
