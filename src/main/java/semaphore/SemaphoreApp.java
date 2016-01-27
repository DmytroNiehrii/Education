package semaphore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by dmitriyn on 1/27/16.
 */
public class SemaphoreApp {
    private static final Logger logger = LoggerFactory.getLogger(SemaphoreApp.class);

    public static void main(String[] args) {

        Runnable limitedCall = new Runnable() {
            final Random rand = new Random();
            final Semaphore available = new Semaphore(3);
            int count = 0;
            public void run() {
                int time = 5;//rand.nextInt(15);
                int num = count++;

                try {
                    available.acquire();

                    logger.info("Executing long-running action for " + time + " seconds... #" + num);

                    Thread.sleep(time * 1000);

                    logger.info("Done with #" + num + "!");

                } catch (InterruptedException intEx) {
                    intEx.printStackTrace();
                } finally {
                    available.release();
                }
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i=0; i<10; i++)
            //new Thread(limitedCall).start();
            executor.submit(new Thread(limitedCall));
    }
}
