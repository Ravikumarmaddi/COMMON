package com.threads;
public class TestJoinMethod2 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(this.currentThread().getName() + " :" + i);
		}
		
		/*if (this.currentThread().getName().equals("Thread-0")) {
			try {
				this.join(); // It continues execution till end of it, after
								// remaining threads will start run.
			} catch (Exception e) {
				System.out.println(e);
			}
		}*/
	}

	public static void main(String args[]) {
		TestJoinMethod2 t1 = new TestJoinMethod2();
		TestJoinMethod2 t2 = new TestJoinMethod2();
		TestJoinMethod2 t3 = new TestJoinMethod2();
		t1.start();
		// t1.start(); //It creates an exception but execution not stopped.
		/*
		 * try { t1.join(); //It continues execution till end of it, after
		 * remaining threads will start run. } catch (Exception e) {
		 * System.out.println(e); }
		 */
		t2.start();
		//t3.start();
		try {
			t1.join(); // It continues execution till end of it, after
							// remaining threads will start run.
			t2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		t3.start();
		

	}
}