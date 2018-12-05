package com.behavioral.chnainofresponsibility;

public class TeamLeadApprover implements LeaveRequestHandler {

	LeaveRequestHandler nextLeavelReqHandler;

	@Override
	public void setNextHandler(LeaveRequestHandler handler) {
		nextLeavelReqHandler = handler;
	}

	@Override
	public void process(LeaveRequestDetails leaveReqDetails) {
		System.out.println("Leave Request is in progress by teamLead");
		if (leaveReqDetails.leaveType.equals("Planned") && leaveReqDetails.no_of_days >5) {
			nextLeavelReqHandler.process(leaveReqDetails);
		} else {
			System.out.println("Leave Request approved By teamlead");
		}
	}

}
