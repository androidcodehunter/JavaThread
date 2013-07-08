package com.javathread.anonymous;

public class AnonymousMainClass {

	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					for (int i = 0; i < 5; i++) {
						System.out.println("I am an anonymous Thread");
						Thread.sleep(3000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}
}
