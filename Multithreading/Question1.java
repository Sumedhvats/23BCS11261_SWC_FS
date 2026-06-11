// Question 1: Countdown and Blast Off using Thread.join()

public class Question1 {
    public static void main(String[] args) throws InterruptedException {

        Thread one = new Thread(() -> {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted.");
                }
            }
        });
        Thread B = new Thread(() -> {
            System.out.println("Blast off!!");
        });
        one.start();
        one.join();
        B.start();
    }
}
