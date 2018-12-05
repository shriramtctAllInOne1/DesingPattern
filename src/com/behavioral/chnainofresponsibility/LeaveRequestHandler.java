package com.behavioral.chnainofresponsibility;

public interface LeaveRequestHandler {
	public  void setNextHandler(LeaveRequestHandler handler);

	public  void process(LeaveRequestDetails leaveReqDetails);

}
