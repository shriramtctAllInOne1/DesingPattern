package com.behavioral.mediatorDesign;

public class Consumer implements Runnable {

	public int id;
	public PCMediator mediator;
	public static int num = 1;

	public Consumer(PCMediator mediator) {
		id = num++;
		this.mediator = mediator;
	}

	public void run() {
		int num;
		while (true) {
			
			System.out.println("Consumer_id" + id+":" + mediator.retriveMessage());
		}

	}

}
