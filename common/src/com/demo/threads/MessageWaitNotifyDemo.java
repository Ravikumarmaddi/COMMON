package com.threads;
public class MessageWaitNotifyDemo {
	 
    public static void main(String[] args) {
     
    	
    	Message msg = new Message("process it");
        WaiterDemo waiter = new WaiterDemo(msg);
        new Thread(waiter,"waiter").start();
         
        WaiterDemo waiter1 = new WaiterDemo(msg);
        new Thread(waiter1, "waiter1").start();
         
        NotifierDemo notifier = new NotifierDemo(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");
    }
 
}