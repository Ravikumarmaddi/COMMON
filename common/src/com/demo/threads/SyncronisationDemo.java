
package com.threads;
public class SyncronisationDemo extends Thread {

	public static void main(String[] args) {
		SyncronisationDemo d = new SyncronisationDemo();
		SyncronisationDemo d1 = new SyncronisationDemo();
		d.start();
		d1.start();
	}

	public synchronized void name() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(i + "   " + this.getName());
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void run() {
		name();
	}

}
