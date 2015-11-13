package com.threads;

/**
 * DEMO: Single method call by two threads behaviours check
 * 0. Single method by tow threads
 * -- Two threads will execute simultaneously 
 * 1. Single static method by tow threads
 * -- Two threads will execute simultaneously 
 * 2. Single synchronized method by tow threads
 * -- Two threads will execute simultaneously 
 * 3. Single synchronized static method by tow threads
 * -- Second thread will execute after completion of first thread.
 * Conclusion:
 * 1. synchronize on method mean lock on that 'this' object.
 * 2. synchronize on static method mean lock on that '<Class_name>.class' object.
 * @author ravikumarmaddi
 */
public class SynchronizedSingleMethodDemo {

	public static void main(String[] args) {
		Thread3 d = new Thread3();
		Thread4 d1 = new Thread4();
		d.start();
		d1.start();
	}

}

class Services2 {

	public static synchronized void name() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName()
						+ "  name-1 --" + i + "   ");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread3 extends Thread {

	public void run() {
		Services2 services = new Services2();
		services.name();
	}
}

class Thread4 extends Thread {

	public void run() {
		Services2 services = new Services2();
		services.name();
	}
}
