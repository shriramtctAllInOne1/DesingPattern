package com.behavioral.mediatorDesign;

public class Producer implements Runnable {
	public int id;
	public PCMediator mediator;
	public static int num = 1;

	public Producer(PCMediator mediator) {
		this.mediator = mediator;
		id = num ++;
	}

	@Override
	public void run() {
		try {
			num = (int) (Math.random() * 100);
			mediator.storeMessage(num);
			System.out.println("Produce_Id" + id + ":" + num+" ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
