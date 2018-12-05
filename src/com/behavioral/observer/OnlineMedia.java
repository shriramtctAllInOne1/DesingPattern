package com.behavioral.observer;

public class OnlineMedia implements Observer {

	@Override
	public void update(Object obj) {
		float interestRate = (float) obj;
		System.out.println("New interestRate updated to Internate" + interestRate);

	}

}
