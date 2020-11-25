package Concurrency.Example4;

public class BenchMain {
    public static void main(String[] args) {

        Bench bench = new Bench(1);
        SeatTakerThread seatTakerThread = new SeatTakerThread(bench);
        SeatTakerThread audriusBareisis = new SeatTakerThread(bench);

        seatTakerThread.start();
        audriusBareisis.start();
    }
}
