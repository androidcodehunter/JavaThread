package com.javathread.synchronize;

public class MyThread extends Thread {
	private int threadId;
	private TargetClass target;

	public MyThread(int threadId, TargetClass target) {
		this.threadId = threadId;
		this.target = target;
	}

	@Override
	public void run() {
		super.run();

		synchronized (target) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			target.call(threadId);
		}

	}

}
