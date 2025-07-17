package print_1_2;

public class Main {

    private static final Object lock = new Object();
    private static boolean turn = false;

    public static void main(String[] args) {
        Thread firstThread = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (turn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {}
                    }
                    try {
                        System.out.println("1");
                        Thread.sleep(250);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    turn = true;
                    lock.notify();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true){
                synchronized (lock) {
                    while (!turn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {}
                    }
                    try {
                        System.out.println("2");
                        Thread.sleep(250);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    turn = false;
                    lock.notify();
                }
            }
        });
        firstThread.start();
        thread2.start();
    }
}
