package advanced.producer_consumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = queue.take();
                if (item == -1) {
                    break;
                }
                System.out.println("Consuming: " + item);
                Thread.sleep(1600);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
