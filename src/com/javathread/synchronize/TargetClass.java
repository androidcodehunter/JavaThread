package com.javathread.synchronize;

public class TargetClass {
	
	public void call(int threadId)
	{
		System.out.println("Calling from Thread"+ threadId);
	}

}
