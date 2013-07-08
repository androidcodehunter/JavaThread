package com.javathread.extending;


public class ExtendingMainClass {
	public static void main(String[] args) {
		ExtendingThread thread = new ExtendingThread();
		thread.start();
		
// If you want to see how each thread works, you can
		// uncover it
		/*try {
			for (int i = 0; i < 5; i++) {
				System.out.println("From Main Class Thread");
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}
}
