// Question 2: Parallel Word Search with Coordinator Thread

public class Question2 {
    static Boolean found = false;

    public static void main(String[] args) {
        String string = "Hello i am sumedh";
        String[] words = string.split(" ");
        String target = "sumedh";
        Thread t1 = new Thread(() -> search(words, target, 0, words.length - 1, "thread 1"));
        Thread t2 = new Thread(() -> search(words, target, 0, words.length - 1, "thread 2"));
        Thread t3 = new Thread(() -> search(words, target, 0, words.length - 1, "thread 3"));
        Thread coordinator = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
            System.out.println("coordinator stopping!");
            t1.interrupt();
            t2.interrupt();
            t3.interrupt();
        });
        t1.start();
        t2.start();
        t3.start();
        coordinator.start();
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
