package com.javathread.runnable;

import java.util.logging.Handler;


public class RunnableMain {
	public static void main(String[] args) {
	/*	You can only use this or
	 * below code for this solution
	 * 
	 * try {
			for (int i = 0; i < 5; i++) {
				System.out.println("asf");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	
			RunnableClass runnable = new RunnableClass();
		new Thread(runnable).start();
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("I am from runnable main");
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
