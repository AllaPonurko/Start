import java.lang.reflect.Array;

public class ArrayModel implements Runnable{
    int k=15;
    public int[] arr =new int[k];
    @Override
    public void run() {
        try{
            for(int i=0;i<k;i++) {
                arr[i]= (int) ((int)-36+ Math.random()*100);
                System.out.println(arr[i]);
            }
            MaxNum();
            MinNum();
            CountOfPositiveNegativeNum();
            }
        catch (ArrayIndexOutOfBoundsException  ex) {
            System.out.println(ex.getMessage());
        }
    }
public void MaxNum()
{int max=arr[0];
  for(int i=0;i<k;i++)
  {
      if(arr[i]>max)
          max=arr[i];
  }
  System.out.println("Максимальне число в масиві: "+max);
}
    public void MinNum()
    {int min=arr[0];
        for(int i=0;i<k;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Мінімальне число в масиві: "+min);
    }
    public void CountOfPositiveNegativeNum()
    {
      int countPositive=0;
       int countNegative=0;
       int countNull=0;
        for(int i=0;i<k;i++)
        {
            if(arr[i]<0)
                countNegative++;
            if(arr[i]>0)
                countPositive++;
            if(arr[i]==0)
                countNull++;
        }
        System.out.println("Кількість позитивних елементів" +
                " в масиві: "+countPositive);
        System.out.println("Кількість негативних елементів" +
                " в масиві: "+countNegative);
        System.out.println("Кількість елементів, що дорівнює 0" +
                " в масиві: "+countNull);
    }
    }

