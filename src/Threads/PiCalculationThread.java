package Threads;

import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;

public class PiCalculationThread implements Runnable{
    double n;
    double pi=1;
    int num;
    Runnable task=()-> {PiCalculation(num);};
    Thread t=new Thread(task);
    public PiCalculationThread(double n,int num)
    {
        this.n=n;
        this.num=num;
    }
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        try{
            t.start();

        }catch (Exception e)
        {
            throw  new RuntimeException(e);
        }
    }
    public double calculation(double n)
    {
        return (n*n)/((n-1)*(n+1));
    }
    public void PiCalculation(int num)
    {for(int i=0;i<num;i++)
    {
       pi*= calculation(n);
       n+=2;
    }
        String str=String.format("%.100f",pi * 2);
        System.out.println("Pi=" + str);
    }
}
