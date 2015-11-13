package com.threads;
class MyStopThread extends Thread {
	private volatile Thread stopIndicator;

	public void start() {
		stopIndicator = new Thread(this);
		stopIndicator.start();
	}

	public void stopThread() {
		stopIndicator = null;
		System.out.println("Thread stoped.");
	}

	@Override
	public void run() {
		Thread thisThread = Thread.currentThread();
		while(thisThread == stopIndicator) {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
			}
		}
	}
}

public class StopThreadDemo {
	public static void main(String[] args) {
		MyStopThread s = new MyStopThread();
		s.start();
		s.stopThread();
		System.out.println(s.isAlive());
	}
}