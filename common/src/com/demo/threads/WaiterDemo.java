package com.threads;

public class WaiterDemo implements Runnable {

	private Message msg;

	public WaiterDemo(Message m) {
		this.msg = m;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		/*
		 * try { wait(); } catch (InterruptedException e1) { // TODO
		 * Auto-generated catch block e1.printStackTrace(); }
		 */
		synchronized (msg) {
			try {
				System.out.println(name + " waiting to get notified at time:"
						+ System.currentTimeMillis());
				msg.wait();
				//msg.wait(1000);
				//wait();
				//msg.notify();
				System.out.println(name + " waiting to get notified at time:"
						+ System.currentTimeMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " waiter thread got notified at time:"
					+ System.currentTimeMillis());
			// process the message now
			System.out.println(name + " processed: " + msg.getMsg());
		}
	}

	public static void main(String[] args) {
		Message m = new Message("Good.....");
		WaiterDemo d = new WaiterDemo(m);
		Thread t = new Thread(d, "waiter");
		t.start();
	}

}