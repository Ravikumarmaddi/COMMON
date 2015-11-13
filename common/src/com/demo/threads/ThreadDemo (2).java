package com.demo.threads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

class T1 extends Thread {
	T1(AtomicInteger num, AtomicBoolean bool) {
		this.num = num;
		this.bool = bool;

	}

	AtomicInteger num = null;
	AtomicBoolean bool = null;

	public void run() {
		while (num.get() < 101) {
			if (num.get() % 2 == 0 && bool.get() == true) {
				System.out.println(Thread.currentThread().getName() + "   "
						+ num.get());
				num.getAndIncrement();
				bool.set(false);
			}
		}
	}
}

class T2 extends Thread {
	T2(AtomicInteger num, AtomicBoolean bool) {
		this.num = num;
		this.bool = bool;

	}

	AtomicInteger num = null;
	AtomicBoolean bool = null;

	public void run() {
		while (num.get() < 101) {
			if (num.get() % 2 == 1 && bool.get() == false) {
				System.out.println(Thread.currentThread().getName() + "   "
						+ num.get());
				num.getAndIncrement();
				bool.set(true);
			}
		}
	}
}

public class ThreadDemo {
	AtomicInteger num = null;
	AtomicBoolean bool = null;

	public ThreadDemo(AtomicInteger num, AtomicBoolean bool) {
		super();
		this.num = num;
		this.bool = bool;
	}

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo(new AtomicInteger(0), new AtomicBoolean(
				true));

		T1 t1 = new T1(td.num, td.bool);
		T2 t2 = new T2(td.num, td.bool);
		t1.start();
		t2.start();

	}
}