package com.threads;

public class CountObjectsDemo extends Thread {

	@Override
	public void run() {
		Entity e[] = new Entity[10];
		for (int i = 0; i < 10; i++) {
			e[i] = new Entity();
		}
	}

	public static void main(String[] args) {
		CountObjectsDemo c1 = new CountObjectsDemo();
		CountObjectsDemo c2 = new CountObjectsDemo();
		CountObjectsDemo c3 = new CountObjectsDemo();
		CountObjectsDemo c4 = new CountObjectsDemo();
		CountObjectsDemo c5 = new CountObjectsDemo();

		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();

		//System.out.println(Entity.getCount());
	}

}

class Entity {
	private static Integer count = 0;

	public Entity() {
		increaseCount();
	}

	private void increaseCount() {
		synchronized (count) {
			count++;
			System.out.println(Thread.currentThread().getName() + "   "+count);
		}
	}

	static Integer getCount() {
		return new Integer(count);
	}
}
