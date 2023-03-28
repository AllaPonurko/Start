import java.lang.reflect.Array;

public class ArrayModel implements Runnable{
    int k=15;
    public int[] arr =new int[k];
    @Override
    public void run() {
        try{
            for(int i=0;i<k;i++) {
                arr[i]= (int) ((int)-100+ Math.random()*100);
                System.out.println(arr[i]);
            }

            }
        catch (ArrayIndexOutOfBoundsException  ex) {
            System.out.println(ex.getMessage());
        }
    }

    }

