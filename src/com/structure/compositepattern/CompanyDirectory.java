package com.structure.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {

	public List<Employee> empList = new ArrayList<Employee>();

	public void addEmployee(Employee emp) {
		empList.add(emp);
	}

	public void removeEmployee(Employee emp) {
		empList.remove(emp);
	}

	@Override
	public void showEmpoloyeeDetail() {
		 for(Employee emp:empList)
	        {
	            emp.showEmpoloyeeDetail();
	        }
	}

}
