package com.structure.compositepattern1;

public class SalaryAccount implements AccountStatement {

	int accountNo;
	String custName;
	int balance;

	public SalaryAccount(int accountNo, String custName, int balance) {
		super();
		this.accountNo = accountNo;
		this.custName = custName;
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public void getAccountStatment() {
		System.out.println("--------Salary account--------");
		System.out.println("Customer Name : " + custName);
		System.out.println("AccountNo : " + accountNo);
		System.out.println("Balance : " + balance);
	}

}
