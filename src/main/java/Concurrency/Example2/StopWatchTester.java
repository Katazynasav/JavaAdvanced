package Concurrency.Example2;

public class StopWatchTester {
    public static void main(String[] args) {
        StopWatchThread stopWatchTester = new StopWatchThread("[SW]");
        stopWatchTester.run();
    }
}
