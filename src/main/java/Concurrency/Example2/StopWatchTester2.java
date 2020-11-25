package Concurrency.Example2;

public class StopWatchTester2 {
    public static void main(String[] args) throws InterruptedException {
        StopWatchThread stopWatch1 = new StopWatchThread("[Laikrodis1]");
        StopWatchThread stopWatch2 = new StopWatchThread("[Laikrodis2]");

        stopWatch1.start();
        stopWatch2.start();
        System.out.println("Main thread starts!!");
        Thread.sleep(2000);
        System.out.println("Main thread still running...");
        Thread.sleep(3000);
        System.out.println("Main thread ends!");

    }
}
