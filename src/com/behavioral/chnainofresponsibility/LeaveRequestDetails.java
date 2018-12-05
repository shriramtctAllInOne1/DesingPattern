package com.behavioral.chnainofresponsibility;

public class LeaveRequestDetails {
	public String leaveType;
	public int no_of_days;

	public LeaveRequestDetails(String leaveType, int no_of_days) {
		this.leaveType = leaveType;
		this.no_of_days=no_of_days;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public int getNo_of_days() {
		return no_of_days;
	}

	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}

}
