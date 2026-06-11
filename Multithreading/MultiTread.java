import java.time.Duration;
import java.time.Instant;
import java.util.Timer;

public class MultiTread
{
    static Boolean found = false;

    static void main() throws InterruptedException {

//ques1

//        Thread one = new Thread(()->{
//            for (int i = 10; i >0; i--) {
//                System.out.println(i);
//                try {
//                    Thread.sleep(1000);
//                }catch (InterruptedException e){
//                    System.out.println("Thread was interrupted.");
//                }
//            }
//        });
//        Thread B = new Thread(()->{
//            System.out.println("Blast off!!");
//        });
//        one.start();
//        one.join();
//        B.start();


//        ques2


//        String string = "Hello i am sumedh";
//        String[] words = string.split(" ");
//        String target = "sumedh";
//        Thread t1 = new Thread(() -> search(words, target, 0, words.length-1, "thread 1"));
//        Thread t2 = new Thread(() -> search(words, target, 0, words.length-1, "thread 2"));
//        Thread t3 = new Thread(() -> search(words, target, 0, words.length-1, "thread 3"));
//        Thread coordinator = new Thread(()->{
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) { }
//            System.out.println("coordinator stopping!");
//            t1.interrupt();
//            t2.interrupt();
//            t3.interrupt();
//        });
//        t1.start();
//        t2.start();
//        t3.start();
//        coordinator.start();

        //Question 3


//        PiggyBank pp = new PiggyBank();
//        Thread thread1 = new Thread(()->{
//            for (int i = 0; i < 2000; i++) {
//                pp.addMoney();
//                System.out.println(pp.balance);
//            }
//        });
//        Thread thread2 = new Thread(()->{
//            for (int i = 0; i < 2000; i++) {
//                pp.addMoney();
//                System.out.println(pp.balance);
//
//            }
//        });Thread thread3 = new Thread(()->{
//            for (int i = 0; i < 2000; i++) {
//                pp.addMoney();
//                System.out.println(pp.balance);
//
//            }
//        });Thread thread4 = new Thread(()->{
//            for (int i = 0; i < 2000; i++) {
//                pp.addMoney();
//                System.out.println(pp.balance);
//
//            }
//        });Thread thread5 = new Thread(()->{
//            for (int i = 0; i < 2000; i++) {
//                pp.addMoney();
//                System.out.println(pp.balance);
//
//            }
//        });
//Instant start = Instant.now();
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        Instant end = Instant.now();
//        Duration timeElapsed = Duration.between(start, end);
//        System.out.println(timeElapsed.getSeconds());


//        ques 4
        // AtomicInteger knife = new AtomicInteger(1);
 // AtomicInteger cuttingboard = new AtomicInteger(1);
 //     Thread t1 = new Thread(() -> {
 //         synchronized (knife) {
 //             System.out.println("Thread 1: Acquired knife");
 //             synchronized (cuttingboard) {
 //                 System.out.println("Thread 1: Acquired cutting board");
 //             }
 //         }
 //     });
 //     Thread t2 = new Thread(() -> {
 //         synchronized (cuttingboard) {
 //             System.out.println("Thread 2: Acquired cutting board");
 //             synchronized (knife) {
 //                 System.out.println("Thread 2: Acquired knife");
 //             }
 //         }
 //     });
 //     t1.start();
 //     t2.start();
//     }
// }
    }
     static class PiggyBank{
        int balance;
        public synchronized void addMoney(){
//            try { Thread.sleep(0, 1); } catch (InterruptedException e) {}
            balance++;
        }
    }
    static void search(String[] words, String target, int start, int end, String threadName) {
        while (!Thread.interrupted()) {
            Thread.yield();
        }
        for (int i = start; i <= end; i++) {
            if (found) {
                System.exit(0);

            }
            if (words[i].equals(target)) {
                System.out.println(threadName);
                found = true;
                System.exit(0);
            }
        }
    }
}
