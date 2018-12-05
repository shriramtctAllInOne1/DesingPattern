package com.behavioral.chnainofresponsibility;

public abstract class AbstractSupportHandler {

	private AbstractSupportHandler nextHandler;
	

    public static String TECHNICAL = "TECH";
    public static String BILLING = "BILL";
    public static String GENERAL = "GEN";

	protected String level;

	
	public void setNextHanlder(AbstractSupportHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public void reciveRequest(String level, String msg) { 
		if (this.level.equals(level)) { 
			handleRequest(msg);
		} else {
			if (nextHandler != null)
				nextHandler.reciveRequest(level, msg);
		}
	}

	abstract protected void handleRequest(String message);

}
