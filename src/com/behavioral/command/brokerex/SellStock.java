package com.behavioral.command.brokerex;

public class SellStock implements Order {

	private StockOperation order;

	public StockOperation getOrder() {
		return order;
	}

	public void setOrder(StockOperation order) {
		this.order = order;
	}

	public SellStock(StockOperation order) {
		super();
		this.order = order;
	}

	@Override
	public void execute() {
		order.sellStock();
	}

}
