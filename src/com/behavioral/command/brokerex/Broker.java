package com.behavioral.command.brokerex;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	private List<Order> orderList;

	public Broker(Order order) {
		super();
		orderList = new ArrayList<Order>();
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	

	
}
