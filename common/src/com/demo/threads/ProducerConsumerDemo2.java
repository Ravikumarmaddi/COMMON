package com.threads;

class Goods2
{
	private int data;
	private boolean flag = true;

	synchronized void put(int a)
	{
		if( !flag )
		{
			try{
				this.wait();
			}catch(Exception e){}
		}
		data = a;
		System.out.println("PUT " + data);
		flag = false;
		notify();
	}

	synchronized int get()
	{
		if(flag)
		{
			try{
				this.wait();
			}catch(Exception e){}
		}

		System.out.println("\tGET " + data);
		flag = true;
		notify();
		return data;
	}
}

class Producer3 extends Thread
{
	Goods2 g;
	
	Producer3(Goods2 g)
	{
		this.g = g;
	}
	public void run()
	{
		int i = 1;

		while(true)
			g.put(i++);
	}
}


class Consumer3 extends Thread
{
	Goods2 g;

	Consumer3(Goods2 g)
	{
		this.g = g;
	}

	public void run()
	{
		while(true)
			g.get();
	}
}

class ProducerConsumerDemo2
{
	public static void main(String[] args) 
	{
		Goods2 gd = new Goods2();
		Producer3 p = new Producer3(gd);
		Consumer3 c = new Consumer3(gd);

		p.start();
		c.start();
	}
}
