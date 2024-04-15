package PCsenpahore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Object> queue;

    private int maxSize;

    private Semaphore consumer;

    private Semaphore producer;

//    public Producer(Queue<Object> queue, int maxSize) {
//        this.queue = queue;
//        this.maxSize = maxSize;
//    }

    public Producer(Queue<Object> queue, int maxSize, Semaphore consumer, Semaphore producer) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.consumer = consumer;
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                producer.acquire();
                if (queue.size() < maxSize) {
                    queue.add(new Object());
                    System.out.println("Continuously producing--");
                }
                consumer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
