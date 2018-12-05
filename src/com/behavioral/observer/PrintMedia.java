package com.behavioral.observer;

public class PrintMedia implements Observer {

	@Override
	public void update(Object obj) {
		float interestRate = (float) obj;
		System.out.println("New interestRate updated to newspaper" + interestRate);

	}

}
