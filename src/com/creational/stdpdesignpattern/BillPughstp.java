package com.creational.stdpdesignpattern;

public class BillPughstp {

	private BillPughstp() {

	}

	public static class BillPughInner {
		private static BillPughstp billPughstpObj = new BillPughstp();
	}

	public static BillPughstp getInstance() {
		return BillPughInner.billPughstpObj;
	}

}
