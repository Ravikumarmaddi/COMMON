package com.threads;

class Goods
{
	private int data;
	private boolean canProduce = true;

	synchronized void put(int value)
	{
		if( !canProduce )
		{
			try{
				this.wait();
			}
			catch(InterruptedException e){}
		}		
		data = value;
		System.out.println("PUT : " + data);
		canProduce = false;
		notify();
	}
	
	synchronized int get()
	{
		if(canProduce)
		{
			try{
				wait();
			}
			catch(InterruptedException e){}
		}
				
		System.out.println("\tGET : " + data);
		canProduce = true;
		notify();
		return data;
	}
}

class Producer2 extends Thread
{
	Goods g;
	Producer2( Goods g )
	{
		this.g = g;
	}
	public void run()
	{
		int i = 1;

		while(true)
		{
			g.put(i++);
		}
	}
}

class Consumer2 extends Thread
{
	Goods g;
	Consumer2(Goods g)
	{
		this.g = g;
	}
	public void run()
	{
		while(true)
		{
			g.get();
		}
	}
}

class ProducerConsumerDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		Goods g = new Goods();

		Producer2 p = new Producer2(g);
		Consumer2 c = new Consumer2(g);
		
		p.start();
		c.start();

		p.join();
		c.join();
	}
}
