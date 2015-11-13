package com.threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

public class InterThreadCommunicationExample {

    public static void main(String args[]) {

        final Queue sharedQ = new LinkedList();

        Thread producer = new Producer4(sharedQ);
        Thread consumer = new Consumer4(sharedQ);

        producer.start();
        consumer.start();

    }
}

class Producer4 extends Thread {
   // private static final Logger logger = Logger.getLogger(Producer4.class);
    private final Queue sharedQ;

    public Producer4(Queue sharedQ) {
        super("Producer4");
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {

        for (int i = 0; i < 4; i++) {

            synchronized (sharedQ) {
                //waiting condition - wait until Queue is not empty
                while (sharedQ.size() >= 1) {
                    try {
                     //   logger.debug("Queue is full, waiting");
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
              //  logger.debug("producing : " + i);
                sharedQ.add(i);
                sharedQ.notify();
            }
        }
    }
}

class Consumer4 extends Thread {
   // private static final Logger logger = Logger.getLogger(Consumer4.class);
    private final Queue sharedQ;

    public Consumer4(Queue sharedQ) {
        super("Consumer4");
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        while(true) {

            synchronized (sharedQ) {
                //waiting condition - wait until Queue is not empty
                while (sharedQ.size() == 0) {
                    try {
                    //    logger.debug("Queue is empty, waiting");
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                int number = (Integer) sharedQ.poll();
            //    logger.debug("consuming : " + number );
                sharedQ.notify();
              
                //termination condition
                if(number == 3){break; }
            }
        }
    }
}


/*
Read more: http://javarevisited.blogspot.com/2013/12/inter-thread-communication-in-java-wait-notify-example.html#ixzz3SKpso3jU
*/	