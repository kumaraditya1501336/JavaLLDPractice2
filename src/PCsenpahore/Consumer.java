package PCsenpahore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Queue<Object> queue;

    private int maxSize;

    private Semaphore consumer;

    private Semaphore producer;

    public Consumer(Queue<Object> queue, int maxSize, Semaphore consumer, Semaphore producer) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.consumer = consumer;
        this.producer = producer;
    }

//    public Consumer(Queue<Object> queue, int maxSize) {
//        this.queue = queue;
//        this.maxSize = maxSize;
//    }

    @Override
    public void run() {
        while (true) {
            try {
                consumer.acquire();
                if (queue.size() > 0) {
                    queue.remove();
                    System.out.println("Continuously consuming--");
                }
                producer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
