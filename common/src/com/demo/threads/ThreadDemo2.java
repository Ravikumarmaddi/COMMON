package com.demo.threads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/*Input:
Thread t1 - prints odd number
Thread t2 - prints even number
Need to print 1 to 100 number in sequence using given two threads.
You can print number at the end of the program execution or during the execution
*/
class T3 extends Thread {
	T3(AtomicInteger num) {
		this.num = num;
	}

	AtomicInteger num = null;

	public void run() {
		while (num.get() < 101) {
			if (num.get() % 2 == 0 ) {
				System.out.println(Thread.currentThread().getName() + "   "
						+ num.get());
				num.getAndIncrement();
				Thread.yield();
			}
		}
	}
}

class T4 extends Thread {
	T4(AtomicInteger num) {
		this.num = num;
	}

	AtomicInteger num = null;
	
	public void run() {
		while (num.get() < 101) {
			if (num.get() % 2 == 1 ) {
				System.out.println(Thread.currentThread().getName() + "   "
						+ num.get());
				num.getAndIncrement();
				Thread.yield();
			}
		}
	}
}

public class ThreadDemo2 {
	AtomicInteger num = null;
	public ThreadDemo2(AtomicInteger num) {
		super();
		this.num = num;
	}

	public static void main(String[] args) {
		ThreadDemo2 td = new ThreadDemo2(new AtomicInteger(0));

		T3 t1 = new T3(td.num);
		T4 t2 = new T4(td.num);
		t1.start();
		t2.start();

	}
}