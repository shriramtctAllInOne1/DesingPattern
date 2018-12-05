package com.structure.compositepattern;

public class Company {
	public static void main(String[] args) {

		Developer deve1 = new Developer("ram", "101", "TL");
		Developer deve2 = new Developer("ram1", "102", "TL");
		CompanyDirectory devDir = new CompanyDirectory();
		devDir.addEmployee(deve1);
		devDir.addEmployee(deve2);
		Manager mg1= new Manager("ram2", "103", "GM");
		Manager mg2= new Manager("ram3", "104", "Gm2");
		CompanyDirectory mgDir = new CompanyDirectory();
		mgDir.addEmployee(mg1);
		mgDir.addEmployee(mg2);
		CompanyDirectory companydir = new CompanyDirectory();
		companydir.addEmployee(devDir);
		companydir.addEmployee(mgDir);
        companydir.showEmpoloyeeDetail();

	}

}
