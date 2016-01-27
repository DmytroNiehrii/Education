package countDownLatch;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Prepping...");

        Race r = new Race(
                "Horse#1",
                "Horse#2",
                "Horse#3"
        );

        System.out.println("It's a race of " + r.getDistance() + " lengths");

        System.out.println("Press Enter to run the race....");
        System.in.read();

        r.run();
    }



}
