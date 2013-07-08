package com.javathread.runnable;


public class RunnableClass implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Im from Runnable Interface");
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
