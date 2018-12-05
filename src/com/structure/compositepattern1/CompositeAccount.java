package com.structure.compositepattern1;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount implements AccountStatement {

	public List<AccountStatement> accstmtList = new ArrayList<AccountStatement>();

	public void addAccount(AccountStatement acstmt) {
		accstmtList.add(acstmt);
	}

	@Override
	public void getAccountStatment() {
		for (AccountStatement accstmt : accstmtList) {
			accstmt.getAccountStatment();
		}
	}

}
