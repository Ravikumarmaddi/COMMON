package com.threads;

public class ObjectShareDemo extends Thread {
	int i = 100;
	public void run() {
         for (int j = 0; j < 100 ; j++) {
			System.out.println(this.getName() + "  :" + i++);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ObjectShareDemo o1 = new ObjectShareDemo();
		ObjectShareDemo o2 = new ObjectShareDemo();
		o1.start();
		o2.start();
	}

}
