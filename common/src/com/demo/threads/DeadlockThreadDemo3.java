package com.threads;

public class DeadlockThreadDemo3 {
	   public static Object Lock1 = new Object();
	   public static Object Lock2 = new Object();
	   
	   public static void main(String args[]) {
	   
	      ThreadDemo1 T1 = new ThreadDemo1();
	      ThreadDemo2 T2 = new ThreadDemo2();
	      T1.start();
	      T2.start();
	   }
	   
	   
	}

class ThreadDemo1 extends Thread {
    public void run() {
       synchronized (DeadlockThreadDemo3.Lock1) {
          System.out.println("Thread 1: Holding lock 1...");
          try { Thread.sleep(10); }
          catch (InterruptedException e) {}
          System.out.println("Thread 1: Waiting for lock 2...");
          synchronized (DeadlockThreadDemo3.Lock2) {
             System.out.println("Thread 1: Holding lock 1 & 2...");
          }
       }
    }
 }
 class ThreadDemo2 extends Thread {
    public void run() {
       synchronized (DeadlockThreadDemo3.Lock2) {
          System.out.println("Thread 2: Holding lock 2...");
         try { Thread.sleep(10); }
          catch (InterruptedException e) {}
          System.out.println("Thread 2: Waiting for lock 1...");
          synchronized (DeadlockThreadDemo3.Lock1) {
             System.out.println("Thread 2: Holding lock 1 & 2...");
          }
       }
    }
 } 