package com.demo.threads;

import java.util.Arrays;
import java.util.List;

import com.google.common.util.concurrent.RateLimiter;
/**
 * This help you understand how is RateLimiter works.
 * @author ravikumar.maddi
 *
 */
public class RLClient2 {
	public static void main(String[] args) {
		RateLimiter rateLimiter = RateLimiter.create(2);
		DT dt = new DT();
		dt.setDaemon(true);
		dt.start();
		T t[] = new T[15];
		for (int i = 0; i < t.length; i++) {
			t[i] = new  T(rateLimiter);
			t[i].start();
		}
	}
}

class T extends Thread {
	RateLimiter rateLimiter = null;

	T(RateLimiter rateLimiter) {
		this.rateLimiter = rateLimiter;
	}

	@Override
	public void run() {
		rateLimiter.acquire();
		for (int i = 0; i < 12; i++) {
			try {
				sleep(100);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(Thread.currentThread().getName() + " ------- Completed..........");
	}
}


class DT extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("-----------------" + i + " Seconds...");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

