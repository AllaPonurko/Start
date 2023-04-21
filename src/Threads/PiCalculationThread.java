package Threads;

import java.util.concurrent.Semaphore;

public class PiCalculationThread implements Runnable{
    Semaphore semaphore;
    double n;
    Runnable task=()-> {System.out.print(calculation(n)+"; ");};
    Thread t=new Thread(task);
    public PiCalculationThread(Semaphore semaphore,double n)
    {
        this.n=n;
        this.semaphore=semaphore;
    }
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        try{
            semaphore.acquire();
            t.start();
            semaphore.release();
        }catch (InterruptedException e)
        {
            throw  new RuntimeException(e);
        }
    }
    public double calculation(double n)
    {
        return (n*n)/((n-1)*(n+1));
    }
}
