import Threads.PiCalculationThread;

import java.util.concurrent.Exchanger;


public class Work_PiCalculation implements Runnable{
    @Override
    public void run() {
        doCalculationPi();
    }
    Exchanger<Double>exchanger=new Exchanger<>();
    public void doCalculationPi() {

        try {
                PiCalculationThread t = new PiCalculationThread( 2,400);
                Thread th = new Thread(t);
                th.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
