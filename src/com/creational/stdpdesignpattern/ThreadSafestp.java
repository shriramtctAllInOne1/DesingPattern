package com.creational.stdpdesignpattern;

/**
 * @author shriram
 *
 */
public class ThreadSafestp {

	/**
	 * 
	 */
	private static ThreadSafestp threadSafestpObj;

	/**
	 * 
	 */
	private ThreadSafestp() {
	}

	public static synchronized ThreadSafestp getInstance() {
		if (threadSafestpObj == null) {
			threadSafestpObj = new ThreadSafestp();
		}
		return threadSafestpObj;

	}
	public static ThreadSafestp getInstance1() {
		if (threadSafestpObj == null) {
			synchronized (threadSafestpObj) {
				if (threadSafestpObj == null) {
					{
						threadSafestpObj = new ThreadSafestp();
					}
				}
			}
		}
		return threadSafestpObj;

	}
}