package com.behavioral.chnainofresponsibility;

public class GMApprover implements LeaveRequestHandler {

	LeaveRequestHandler nextLeavelReqHandler;

	@Override
	public void setNextHandler(LeaveRequestHandler handler) {
		nextLeavelReqHandler = handler;
	}

	@Override
	public void process(LeaveRequestDetails leaveReqDetails) {
		System.out.println("Leave Request in process by GM");
		if (leaveReqDetails.leaveType.equals("Planned") && leaveReqDetails.no_of_days > 150) {
			nextLeavelReqHandler.process(leaveReqDetails);
		} else {
			System.out.println("Leave Request approved by GM");
		}
	}

}
