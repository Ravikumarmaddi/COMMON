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
 *
 */
public class SynchronizedTowMethodDemo {

	public static void main(String[] args) {
		Thread1 d = new Thread1();
		Thread2 d1 = new Thread2();
		d.start();
		d1.start();
	}

}

class Services {

	public synchronized static  void name1() {
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

	public synchronized static void name2() {
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

class Thread1 extends Thread {

	public void run() {
		Services services = new Services();
		services.name1();
	}
}

class Thread2 extends Thread {

	public void run() {
		Services services = new Services();
		services.name2();
	}
}
