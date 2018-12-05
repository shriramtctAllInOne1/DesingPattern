package com.behavioral.chnainofresponsibility;

public class MGApprover implements LeaveRequestHandler {

	private LeaveRequestHandler nextLeavelReqHandler;

	@Override
	public void setNextHandler(LeaveRequestHandler handler) {
	      nextLeavelReqHandler = handler;
	}

	@Override
	public void process(LeaveRequestDetails leaveReqDetails) {
		System.out.println("Leave Request in progres byh manager");
		if (leaveReqDetails.leaveType.equals("Planned") && leaveReqDetails.no_of_days > 30) {
			nextLeavelReqHandler.process(leaveReqDetails);
		} else {
			System.out.println("Leave Request approved by manager");
		}
	}

}
