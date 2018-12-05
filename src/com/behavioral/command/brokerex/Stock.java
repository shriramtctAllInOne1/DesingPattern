package com.behavioral.command.brokerex;

public class Stock implements StockOperation {

	private String stockName;
	private int quanttity;

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getQuanttity() {
		return quanttity;
	}

	public void setQuanttity(int quanttity) {
		this.quanttity = quanttity;
	}

	@Override
	public void sellStock() {
		System.out.print("Sell Stock [ " + stockName + "] of Quantity [" + quanttity + "]");
	}

	@Override
	public void buyStock() {
		System.out.print("Buy Stock [ " + stockName + "] of Quantity [" + quanttity + "]");
	}

}
