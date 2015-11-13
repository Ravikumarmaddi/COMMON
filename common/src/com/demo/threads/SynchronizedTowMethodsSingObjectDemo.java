package com.threads;

/**
 * DEMO: Tow methods call by two threads behaviours check
 * 1. Two static methods by tow threads
 * -- Two threads will execute simultaneously 
 * 2. Two synchronized methods by tow threads
 * -- Two threads will execute simultaneously 
 * 3. Two synchronized static methods by tow threads
 * -- Second thread will execute after completion of first thread. 
 * @author ravikumarmaddi
 */
public class SynchronizedTowMethodsSingObjectDemo {
public static Services3 services3 = null;
	public static void main(String[] args) {
		services3 = new Services3();
		Thread5 d = new Thread5();
		Thread6 d1 = new Thread6();
		d.start();
		d1.start();
	}
}

class Services3 {

	public synchronized void name1() {
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

	public synchronized void name2() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName()
						+ "  name-2 --" + i + "   ");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Thread5 extends Thread {

	public void run() {
		
		SynchronizedTowMethodsSingObjectDemo.services3.name1();
	}
}

class Thread6 extends Thread {

	public void run() {
		SynchronizedTowMethodsSingObjectDemo.services3.name2();
	}
}
