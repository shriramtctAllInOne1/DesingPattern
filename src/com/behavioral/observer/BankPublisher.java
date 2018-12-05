package com.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BankPublisher implements Subject {
	private String type;
	private String bank;
	private Double interestRate;

	public List<Observer> ObserverList = new ArrayList<Observer>();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public List<Observer> getObserverList() {
		return ObserverList;
	}

	public void setObserverList(List<Observer> observerList) {
		ObserverList = observerList;
	}

	BankPublisher(String type, String bank, Double interestRate) {
		this.type = type;
		this.bank = bank;
		this.interestRate = interestRate;
	}

	@Override
	public void register(Observer observer) {
		  if(!ObserverList.contains(observer)){
			  ObserverList.add(observer);
		  }

	}

	@Override
	public void unRegister(Observer observer) {
		if(ObserverList.contains(observer)){
			  ObserverList.remove(observer);
		  }
	}

	@Override
	public void notifyObserver() {
        for(Observer obj : ObserverList){
         obj.update(this.interestRate);
	}
	}
}
