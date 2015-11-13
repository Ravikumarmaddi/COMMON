package com.threads;
public class ThreadDemo extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(this.currentThread().getName() + " :" + i);
		}

	}

	public static void main(String args[]) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		ThreadDemo t3 = new ThreadDemo();
		t1.start(); 
		t2.start(); 
		//t3.setDaemon(true);
		t3.start();
		/*
		 * t1.start(); t2.start(); // t3.start(); try { t1.join(); // It
		 * continues execution till end of it, after // remaining threads will
		 * start run. t2.join(); } catch (Exception e) { System.out.println(e);
		 * }
		 */
		//t3.start();
		try {
			t1.join();
			t2.join();
			//t3.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		print();
	}

	public static void print() {
		System.out.println("Print called......");
	}
}