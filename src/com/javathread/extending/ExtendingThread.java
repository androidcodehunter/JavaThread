package com.javathread.extending;

public class ExtendingThread extends Thread {

	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("I am an extending thread");
				sleep(3000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
