package com.threads;
public class ThreadBlockingDemo extends Thread {
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
		ThreadBlockingDemo t1 = new ThreadBlockingDemo();
		ThreadBlockingDemo t2 = new ThreadBlockingDemo();
		ThreadBlockingDemo t3 = new ThreadBlockingDemo();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
        // Here t3 starts execution only after t1, t2 completed.
		t3.start();
		try {
			t3.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		// Here print will calls only after t3 completed.
		print();
	}

	public static void print() {
		System.out.println("All threads executed.");
	}
}