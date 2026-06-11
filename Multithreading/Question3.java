// Question 3: PiggyBank with Synchronized Access (5 threads)

import java.time.Duration;
import java.time.Instant;

public class Question3 {
    public static void main(String[] args) {
        PiggyBank pp = new PiggyBank();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                pp.addMoney();
                System.out.println(pp.balance);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                pp.addMoney();
                System.out.println(pp.balance);
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                pp.addMoney();
                System.out.println(pp.balance);
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                pp.addMoney();
                System.out.println(pp.balance);
            }
        });
        Thread thread5 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                pp.addMoney();
                System.out.println(pp.balance);
            }
        });
        Instant start = Instant.now();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println(timeElapsed.getSeconds());
    }

    static class PiggyBank {
        int balance;

        public synchronized void addMoney() {
            balance++;
        }
    }
}
