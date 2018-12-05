package com.behavioral.chnainofresponsibility;

public class MainApp {

	public static void main(String[] args) {
		TeamLeadApprover teamlead = new TeamLeadApprover();
		MGApprover mg = new MGApprover();
		GMApprover gm = new GMApprover();
		LeaveRequestDetails leaveDetails = new LeaveRequestDetails("Planned", 140);
		teamlead.setNextHandler(mg);
		mg.setNextHandler(gm);
		teamlead.process(leaveDetails);
		
		//mg.process(leaveDetails);
		//gm.process(leaveDetails);
	}

}
