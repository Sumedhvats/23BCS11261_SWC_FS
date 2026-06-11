// Question 4: Deadlock Demo with Knife and Cutting Board

import java.util.concurrent.atomic.AtomicInteger;

public class Question4 {
    public static void main(String[] args) {
        AtomicInteger knife = new AtomicInteger(1);
        AtomicInteger cuttingboard = new AtomicInteger(1);

        Thread t1 = new Thread(() -> {
            synchronized (knife) {
                System.out.println("Thread 1: Acquired knife");
                synchronized (cuttingboard) {
                    System.out.println("Thread 1: Acquired cutting board");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (cuttingboard) {
                System.out.println("Thread 2: Acquired cutting board");
                synchronized (knife) {
                    System.out.println("Thread 2: Acquired knife");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
