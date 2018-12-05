package com.structure.compositepattern1;

public class MainUtil {

	public static void main(String[] args) {
		SavingAccount sacc = new SavingAccount(123, "ram1", 12344);
		SavingAccount sacc1 = new SavingAccount(1234, "ram11", 12345);
		CompositeAccount savingaccdir= new CompositeAccount();
		savingaccdir.addAccount(sacc);
		savingaccdir.addAccount(sacc1);
		
		CompositeAccount salaryaccdir= new CompositeAccount();
		SalaryAccount salaryacc = new SalaryAccount(1235, "ram12", 12344);
		SalaryAccount salaryacc1 = new SalaryAccount(1235, "ram16", 12344);
		salaryaccdir.addAccount(salaryacc);
		salaryaccdir.addAccount(salaryacc1);
		
		CompositeAccount compositeAccount= new CompositeAccount();
		compositeAccount.addAccount(salaryaccdir);
		compositeAccount.addAccount(savingaccdir);
		compositeAccount.getAccountStatment();
	}

}
