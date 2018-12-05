package com.behavioral.command.brokerex;

public class BuyStock implements Order {

	private StockOperation order;

	public StockOperation getOrder() {
		return order;
	}

	public void setOrder(StockOperation order) {
		this.order = order;
	}

	public void Bystock(StockOperation order) {

		this.order = order;
	}

	@Override
	public void execute() {
		order.buyStock();
	}

}
