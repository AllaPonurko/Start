import Threads.PiCalculationThread;

import java.util.concurrent.Semaphore;

public class Work_PiCalculation implements Runnable{
    @Override
    public void run() {
        doCalculationPi();
    }
    public void doCalculationPi() {
        double n = 2;
        double pi = 1;
        Semaphore semaphore = new Semaphore(2);
        try {
            for (int i = 0; i < 200; i++) {
                PiCalculationThread t = new PiCalculationThread(semaphore, n);
                Thread th = new Thread(t);
                th.start();
                pi *= t.calculation(n);
                n += 2;
            }
            System.out.println("Pi=" + pi * 2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
