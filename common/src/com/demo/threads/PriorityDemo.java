package com.threads;


class MyThread extends Thread
{
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println( getName() );
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
	}
}

public class PriorityDemo
{
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		t1.setName("First");

		MyThread t2 = new MyThread();
		t2.setName("\tSecond");

		/*t1.setPriority(Integer.parseInt("5"));
		t2.setPriority(Integer.parseInt("10"));
		*/
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
	}
}