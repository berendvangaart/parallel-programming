import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Multi implements Runnable {

    private Counter c;
    static Lock lock = new ReentrantLock();


    public Multi(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {

        System.out.println("hi thread ");

        for (int i = 0; i < 1000; i++) {

            lock.lock();
            c.increment();
            lock.unlock();
        }

    }
}

